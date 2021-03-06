package com.wx.baidurecdemo;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.wx.baidurecdemo.contorller.WakeUpControl;
import com.wx.baidurecdemo.util.IStatus;
import com.wx.baidurecdemo.wakeup.MyWeakUpListener;
import com.wx.baidurecdemo.wakeup.WakeupParams;

import java.util.Map;

public class WakeUpActivity extends CommonActivity implements IStatus{
private static String TAG = "WakeUpActivity";
    private Button btnStart;

    {
        layoutId = R.layout.activity_wake_up;

    }
    private static int mStatus = STATUS_NONE;
    protected WakeUpControl myWakeup;


    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: --------start");
        super.onResume();
        if(mStatus == STATUS_NONE) {
            startRecog();
            btnStart.performClick();
        }
        Log.d(TAG, "onResume: --------end");
    }

    @Override
    protected void initRecog() {
        Log.d(TAG, "initRecog:-------------start");
        IWakeupListener listener = new MyWeakUpListener();
        myWakeup = new WakeUpControl(this,listener);
        Log.d(TAG, "initRecog:-------------end");
    }
    private void startRecog() {
        Log.d(TAG, "startRecog: ------------------------------start");
        WakeupParams wakeupParams = new WakeupParams(this);
        Map<String,Object> params = wakeupParams.fetch();
        myWakeup.start(params);
        mStatus = STATUS_WAITING_READY;
        Log.d(TAG, "startRecog: ------------------------------end");
    }

    @Override
    protected void initView() {
        super.initView();
        btnStart = ((Button) findViewById(R.id.btn_start));
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStatus) {
                    case STATUS_NONE:
                        mStatus = STATUS_WAITING_READY;
                        startRecog();
                        break;
                    case STATUS_WAITING_READY:
                        mStatus = STATUS_NONE;
                        stopRecog();
                        break;
                }
            }
        });
    }

    private void stopRecog() {
        myWakeup.stop();
    }

    @Override
    protected void onDestroy() {
        myWakeup.release();
        super.onDestroy();
    }
}
