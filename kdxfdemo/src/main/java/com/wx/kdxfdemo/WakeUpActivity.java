package com.wx.kdxfdemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechEvent;
import com.iflytek.cloud.VoiceWakeuper;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.WakeuperResult;
import com.iflytek.cloud.util.ResourceUtil;
import com.wx.kdxfdemo.Constants.Istatus;

import org.json.JSONException;
import org.json.JSONObject;

public class WakeUpActivity extends AppCompatActivity implements Istatus {
    // 语音唤醒对象
    private VoiceWakeuper mIvw;
    private int mStatus = STATUS_STOPPED;
    private int curThresh = 10;
    private String keep_alive = "1";
    private String ivwNetMode = "0";
    private Toast mToast;
    private static String TAG = "WakeUpActivity";
    private Button btnStatus;
    // 唤醒结果内容
    private String resultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wake_up);
        requestPermissions();
        initViews();
        // 初始化唤醒对象
        mIvw = VoiceWakeuper.createWakeuper(this, null);
    }

    private void initViews() {
        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        btnStatus = ((Button) findViewById(R.id.btn_status));
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStatus) {
                    case STATUS_READY:
                        stopRecog();
                        break;
                    case STATUS_STOPPED:
                        startRecog();
                        break;
                }
            }
        });
    }

    private void stopRecog() {
        mIvw.stopListening();
        mStatus = STATUS_STOPPED;
        btnStatus.setText(R.string.btn_statusa);
    }

    private void startRecog() {
        //非空判断，防止因空指针使程序崩溃
        mIvw = VoiceWakeuper.getWakeuper();
        if (mIvw != null) {
            // 清空参数
            mIvw.setParameter(SpeechConstant.PARAMS, null);
            // 唤醒门限值，根据资源携带的唤醒词个数按照“id:门限;id:门限”的格式传入
            mIvw.setParameter(SpeechConstant.IVW_THRESHOLD, "0:" + curThresh);
            // 设置唤醒模式
            mIvw.setParameter(SpeechConstant.IVW_SST, "wakeup");
            // 设置持续进行唤醒
            mIvw.setParameter(SpeechConstant.KEEP_ALIVE, keep_alive);
            // 设置闭环优化网络模式
            mIvw.setParameter(SpeechConstant.IVW_NET_MODE, ivwNetMode);
            // 设置唤醒资源路径
            mIvw.setParameter(SpeechConstant.IVW_RES_PATH, getResource());
            // 设置唤醒录音保存路径，保存最近一分钟的音频
            mIvw.setParameter(SpeechConstant.IVW_AUDIO_PATH, Environment.getExternalStorageDirectory().getPath() + "/msc/ivw.wav");
            mIvw.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
            // 如有需要，设置 NOTIFY_RECORD_DATA 以实时通过 onEvent 返回录音音频流字节
            //mIvw.setParameter( SpeechConstant.NOTIFY_RECORD_DATA, "1" );
            // 启动唤醒
            mIvw.startListening(mWakeuperListener);
            mStatus = STATUS_READY;
            btnStatus.setText(R.string.btn_statusb);
        } else {
            showTip("唤醒未初始化");
        }
    }

    private void setBtnText(final int stringId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                btnStatus.setText(stringId);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mStatus == STATUS_STOPPED)
            btnStatus.performClick();
    }

    private WakeuperListener mWakeuperListener = new WakeuperListener() {

        @Override
        public void onResult(WakeuperResult result) {
            Log.d(TAG, "onResult");
            if (!"1".equalsIgnoreCase(keep_alive)) {
                setBtnText(R.string.btn_statusa);
            }
            try {
                String text = result.getResultString();
                JSONObject object;
                object = new JSONObject(text);
                StringBuffer buffer = new StringBuffer();
                buffer.append("【RAW】 " + text);
                buffer.append("\n");
                buffer.append("【操作类型】" + object.optString("sst"));
                buffer.append("\n");
                buffer.append("【唤醒词id】" + object.optString("id"));
                buffer.append("\n");
                buffer.append("【得分】" + object.optString("score"));
                buffer.append("\n");
                buffer.append("【前端点】" + object.optString("bos"));
                buffer.append("\n");
                buffer.append("【尾端点】" + object.optString("eos"));
                resultString = buffer.toString();
                startActivity(new Intent(WakeUpActivity.this,SearcherActivity.class));
            } catch (JSONException e) {
                resultString = "结果解析出错";
                e.printStackTrace();
            }
            Log.d(TAG, "onResult: resultString = " +resultString);
        }

        @Override
        public void onError(SpeechError error) {
            showTip(error.getPlainDescription(true));
            setBtnText(R.string.btn_statusa);
        }

        @Override
        public void onBeginOfSpeech() {
        }

        @Override
        public void onEvent(int eventType, int isLast, int arg2, Bundle obj) {
            switch (eventType) {
                // EVENT_RECORD_DATA 事件仅在 NOTIFY_RECORD_DATA 参数值为 真 时返回
                case SpeechEvent.EVENT_RECORD_DATA:
                    final byte[] audio = obj.getByteArray(SpeechEvent.KEY_EVENT_RECORD_DATA);
                    Log.i(TAG, "ivw audio length: " + audio.length);
                    break;
            }
        }

        @Override
        public void onVolumeChanged(int volume) {

        }
    };

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy WakeDemo");
//        // 销毁合成对象
//        mIvw = VoiceWakeuper.getWakeuper();
//        if (mIvw != null) {
//            mIvw.destroy();
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop ");
        // 销毁合成对象
        mIvw = VoiceWakeuper.getWakeuper();
        if (mIvw != null) {
            mIvw.destroy();
        }
    }

    private String getResource() {
        final String resPath = ResourceUtil.generateResourcePath(WakeUpActivity.this, ResourceUtil.RESOURCE_TYPE.assets, "ivw/" + getString(R.string.app_id) + ".jet");
        Log.d(TAG, "resPath: " + resPath);
        return resPath;
    }

    private void showTip(final String str) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mToast.setText(str);
                mToast.show();
            }
        });
    }
    private void requestPermissions(){
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                int permission = ActivityCompat.checkSelfPermission(this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE);
                if(permission!= PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,new String[] {
                            Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.LOCATION_HARDWARE,Manifest.permission.READ_PHONE_STATE,
                            Manifest.permission.WRITE_SETTINGS,Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.RECORD_AUDIO,Manifest.permission.READ_CONTACTS},0x0010);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 0x0010){
            for (int i = 0; i < permissions.length; i++) {
                int grantResult = grantResults[i];
                Log.d(TAG, "onRequestPermissionsResult: grantResult=" +grantResult);
            }
        }
    }
}
