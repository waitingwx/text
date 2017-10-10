package com.wx.kdxfdemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechEvent;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.VoiceWakeuper;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.WakeuperResult;
import com.iflytek.cloud.util.ResourceUtil;
import com.wx.kdxfdemo.Constants.Istatus;
import com.wx.kdxfdemo.speech.util.JsonParser;
import com.wx.kdxfdemo.speech.util.XmlParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;

public class SearcherActivity extends AppCompatActivity implements Istatus {
    // 语音唤醒对象
    private VoiceWakeuper mivwVoiceWakeuper;
    // 语音识别对象
    private SpeechRecognizer mAsrSpeechRecog;
    // 唤醒结果内容
    private String resultString;
    // 识别结果内容
    private String recoString;
    private String TAG = "SearcherActivity";
    private Toast mToast;
    // 云端语法文件
    private String mCloudGrammar = null;
    // 云端语法id
    private String mCloudGrammarID;
    // 本地语法id
    private String mLocalGrammarID;
    // 本地语法文件
    private String mLocalGrammar = null;
    // 本地语法构建路径
    private String grmPath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + "/msc/test";
    // 引擎类型
    private String mEngineType = SpeechConstant.TYPE_CLOUD;
    private int curThresh = 60;
    private Button btnStatus;
    private int mStatus = STATUS_STOPPED;
    boolean isSuss = false;
    private EditText etResult;
    // 返回结果格式，支持：xml,json
    private String mResultType = "json";
    private String GRAMMER_TYPE_ABNF = "abnf";
    private String GRAMMER_TYPE_BNF = "bnf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searcher);
        initViews();

        // 初始化唤醒对象
        mivwVoiceWakeuper = VoiceWakeuper.createWakeuper(this, null);
        // 初始化识别对象---唤醒+识别,用来构建语法
        mAsrSpeechRecog = SpeechRecognizer.createRecognizer(this, mInitListener);
        // 初始化语法文件
        mCloudGrammar = readFile(this, "launch_voice_recog.abnf", "utf-8");
        mLocalGrammar = readFile(this, "wake.bnf", "utf-8");
    }

    private void initViews() {
        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        etResult = ((EditText) findViewById(R.id.et_recog_result));
        btnStatus = ((Button) findViewById(R.id.btn_status));
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStatus) {
                    case STATUS_READY:

                        stopShot();
                        break;
                    case STATUS_STOPPED:
                        startShot();
                        break;
                }
            }
        });
    }

    private void stopShot() {
        mivwVoiceWakeuper = VoiceWakeuper.getWakeuper();
        if (mivwVoiceWakeuper != null) {
            mivwVoiceWakeuper.stopListening();
            mStatus = STATUS_STOPPED;
            btnStatus.setText(R.string.btn_statusa);
        } else {
            showTip("唤醒未初始化");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isSuss)
            isSuss = buildCloudGrammer();
        if (isSuss && mStatus == STATUS_STOPPED) {
            Log.d(TAG, "onResume: ------成功生成cloudGrammer");
            btnStatus.performClick();
        }
    }

    /**
     * 读取asset目录下文件。
     *
     * @return content
     */
    public static String readFile(Context mContext, String file, String code) {
        int len = 0;
        byte[] buf = null;
        String result = "";
        try {
            InputStream in = mContext.getAssets().open(file);
            len = in.available();
            buf = new byte[len];
            in.read(buf, 0, len);

            result = new String(buf, code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private WakeuperListener mWakeuperListener = new WakeuperListener() {

        @Override
        public void onResult(WakeuperResult result) {
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
            } catch (JSONException e) {
                resultString = "结果解析出错";
                e.printStackTrace();
            }

            Log.d(TAG, "onResult: resultString = " + resultString);
        }

        @Override
        public void onError(SpeechError error) {
            showTip(error.getPlainDescription(true));
        }

        @Override
        public void onBeginOfSpeech() {
            showTip("开始说话");
        }

        @Override
        public void onEvent(int eventType, int isLast, int arg2, Bundle obj) {
            Log.d(TAG, "eventType:" + eventType + "arg1:" + isLast + "arg2:" + arg2);
            // 识别结果
            if (SpeechEvent.EVENT_IVW_RESULT == eventType) {
                RecognizerResult reslut = ((RecognizerResult) obj.get(SpeechEvent.KEY_EVENT_IVW_RESULT));
                recoString += JsonParser.parseGrammarResult(reslut.getResultString());
                etResult.setText(recoString);
            }
        }

        @Override
        public void onVolumeChanged(int volume) {
            // TODO Auto-generated method stub

        }

    };

    private void showTip(final String str) {
        mToast.setText(str);
        mToast.show();
    }

    boolean buildCloudGrammer() {
        int ret = 0;
        boolean isSussess = false;
        if (mEngineType.equals(SpeechConstant.TYPE_CLOUD)) {
            // 设置参数
            mAsrSpeechRecog.setParameter(SpeechConstant.ENGINE_TYPE, mEngineType);
            mAsrSpeechRecog.setParameter(SpeechConstant.TEXT_ENCODING, "utf-8");
            // 开始构建语法
            ret = mAsrSpeechRecog.buildGrammar(GRAMMER_TYPE_ABNF, mCloudGrammar, grammarListener);
            if (ret != ErrorCode.SUCCESS) {
                showTip("语法构建失败,错误码：" + ret);
            } else
                isSussess = true;
        } else {
            mAsrSpeechRecog.setParameter(SpeechConstant.PARAMS, null);
            mAsrSpeechRecog.setParameter(SpeechConstant.TEXT_ENCODING, "utf-8");
            // 设置引擎类型
            mAsrSpeechRecog.setParameter(SpeechConstant.ENGINE_TYPE, mEngineType);
            // 设置语法构建路径
            mAsrSpeechRecog.setParameter(ResourceUtil.GRM_BUILD_PATH, grmPath);
            // 设置资源路径
            mAsrSpeechRecog.setParameter(ResourceUtil.ASR_RES_PATH, getResourcePath());
            ret = mAsrSpeechRecog.buildGrammar(GRAMMER_TYPE_BNF, mLocalGrammar, grammarListener);
            if (ret != ErrorCode.SUCCESS) {
                showTip("语法构建失败,错误码：" + ret);
            } else
                isSussess = true;
        }
        return isSussess;
    }

    GrammarListener grammarListener = new GrammarListener() {
        @Override
        public void onBuildFinish(String grammarId, SpeechError error) {
            if (error == null) {
                if (mEngineType.equals(SpeechConstant.TYPE_CLOUD)) {
                    mCloudGrammarID = grammarId;
                } else {
                    mLocalGrammarID = grammarId;
                }
                showTip("语法构建成功：" + grammarId);
            } else {
                showTip("语法构建失败,错误码：" + error.getErrorCode());
            }
        }
    };

    void startShot() {
        // 非空判断，防止因空指针使程序崩溃
        mivwVoiceWakeuper = VoiceWakeuper.getWakeuper();
        if (null != mivwVoiceWakeuper && null != mAsrSpeechRecog) {
            resultString = "";
            recoString = "";
            etResult.setText(resultString);

            final String resPath = ResourceUtil.generateResourcePath(this, ResourceUtil.RESOURCE_TYPE.assets, "ivw/" + getString(R.string.app_id) + ".jet");
            // 清空参数
            mivwVoiceWakeuper.setParameter(SpeechConstant.PARAMS, null);
            // 设置识别引擎
            mivwVoiceWakeuper.setParameter(SpeechConstant.ENGINE_TYPE, mEngineType);
            // 设置唤醒资源路径
            mivwVoiceWakeuper.setParameter(ResourceUtil.IVW_RES_PATH, resPath);
            /**
             * 唤醒门限值，根据资源携带的唤醒词个数按照“id:门限;id:门限”的格式传入
             * 示例demo默认设置第一个唤醒词，建议开发者根据定制资源中唤醒词个数进行设置
             */
            mivwVoiceWakeuper.setParameter(SpeechConstant.IVW_THRESHOLD, "0:"
                    + curThresh);
            // 设置唤醒+识别模式
            mivwVoiceWakeuper.setParameter(SpeechConstant.IVW_SST, "oneshot");
            // 设置返回结果格式
            mivwVoiceWakeuper.setParameter(SpeechConstant.RESULT_TYPE, "json");
//
//				mivwVoiceWakeuper.setParameter(SpeechConstant.IVW_SHOT_WORD, "0");

            // 设置唤醒录音保存路径，保存最近一分钟的音频
            mivwVoiceWakeuper.setParameter(SpeechConstant.IVW_AUDIO_PATH, Environment.getExternalStorageDirectory().getPath() + "/msc/ivw.wav");
            mivwVoiceWakeuper.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");

            if (mEngineType.equals(SpeechConstant.TYPE_CLOUD)) {
                if (!TextUtils.isEmpty(mCloudGrammarID)) {
                    // 设置云端识别使用的语法id
                    mivwVoiceWakeuper.setParameter(SpeechConstant.CLOUD_GRAMMAR,
                            mCloudGrammarID);
                    mivwVoiceWakeuper.startListening(mWakeuperListener);//开始唤醒监听
                    
                    mAsrSpeechRecog.startListening(mRecognizerListener);//开始语法识别监听
                    
                    mStatus = STATUS_READY;
                    btnStatus.setText(R.string.btn_statusb);
                } else {
                    showTip("请先构建语法");
                }
            } else {
                if (!TextUtils.isEmpty(mLocalGrammarID)) {
                    // 设置本地识别资源
                    mivwVoiceWakeuper.setParameter(ResourceUtil.ASR_RES_PATH,
                            getResourcePath());
                    // 设置语法构建路径
                    mivwVoiceWakeuper.setParameter(ResourceUtil.GRM_BUILD_PATH, grmPath);
                    // 设置本地识别使用语法id
                    mivwVoiceWakeuper.setParameter(SpeechConstant.LOCAL_GRAMMAR,
                            mLocalGrammarID);
                    mivwVoiceWakeuper.startListening(mWakeuperListener);
                } else {
                    showTip("请先构建语法");
                }
            }

        } else {
            showTip("唤醒未初始化");
        }
    }

    // 获取识别资源路径
    private String getResourcePath() {
        StringBuffer tempBuffer = new StringBuffer();
        // 识别通用资源
        tempBuffer.append(ResourceUtil.generateResourcePath(this,
                ResourceUtil.RESOURCE_TYPE.assets, "asr/common.jet"));
        return tempBuffer.toString();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy OneShotDemo");
        mivwVoiceWakeuper = VoiceWakeuper.getWakeuper();
        if (mivwVoiceWakeuper != null) {
            mivwVoiceWakeuper.destroy();
        } else {
            showTip("唤醒未初始化");
        }
    }
    private RecognizerListener mRecognizerListener = new RecognizerListener() {

        @Override
        public void onVolumeChanged(int volume, byte[] data) {
            showTip("当前正在说话，音量大小：" + volume);
            Log.d(TAG, "返回音频数据："+data.length);
            showAnimate(volume);
        }

        @Override
        public void onResult(final RecognizerResult result, boolean isLast) {
            if (null != result && !TextUtils.isEmpty(result.getResultString())) {
                Log.d(TAG, "recognizer result：" + result.getResultString());
                String text = "";
                if (mResultType.equals("json")) {
                    text = JsonParser.parseGrammarResult(result.getResultString(), mEngineType);
                    switch (text) {
                        case "搜索":
                            Log.d(TAG, "onResult: -----TODO:跳转搜索！！！");
                            break;
                        case "查看":
                            break;
                        case "识别":
                            break;
                    }
                } else if (mResultType.equals("xml")) {
                    text = XmlParser.parseNluResult(result.getResultString());
                }
                // 显示
                ((EditText) findViewById(R.id.et_recog_result)).setText(text);
            } else {
                Log.d(TAG, "recognizer result : null");
            }
        }

        @Override
        public void onEndOfSpeech() {
            // 此回调表示：检测到了语音的尾端点，已经进入识别过程，不再接受语音输入
            showTip("结束说话");
        }

        @Override
        public void onBeginOfSpeech() {
            // 此回调表示：sdk内部录音机已经准备好了，用户可以开始语音输入
            showTip("开始说话");
        }

        @Override
        public void onError(SpeechError error) {
            showTip("onError Code："	+ error.getErrorCode());
        }

        @Override
        public void onEvent(int eventType, int arg1, int arg2, Bundle obj) {
            // 以下代码用于获取与云端的会话id，当业务出错时将会话id提供给技术支持人员，可用于查询会话日志，定位出错原因
            // 若使用本地能力，会话id为null
            //	if (SpeechEvent.EVENT_SESSION_ID == eventType) {
            //		String sid = obj.getString(SpeechEvent.KEY_EVENT_SESSION_ID);
            //		Log.d(TAG, "session id =" + sid);
            //	}
        }

    };

    private void showAnimate(int volume) {
        
    }
    /**
     * 初始化监听器。
     */
    private InitListener mInitListener = new InitListener() {

        @Override
        public void onInit(int code) {
            Log.d(TAG, "SpeechRecognizer init() code = " + code);
            if (code != ErrorCode.SUCCESS) {
                showTip("初始化失败,错误码："+code);
            }
        }
    };
}
