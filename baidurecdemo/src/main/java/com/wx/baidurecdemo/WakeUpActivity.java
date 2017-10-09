package com.wx.baidurecdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wx.baidurecdemo.contorller.WakeUpControl;
import com.wx.baidurecdemo.util.IStatus;
import com.wx.baidurecdemo.wakeup.MyWeakUpListener;
import com.wx.baidurecdemo.wakeup.WakeupParams;

import java.util.Map;

public class WakeUpActivity extends CommonActivity implements IStatus{

    private Button btnStart;

    {
        layoutId = R.layout.activity_wake_up;

    }
    private static int mStatus = STATUS_NONE;
    protected WakeUpControl myWakeup;

    @Override
    protected void onResume() {
        super.onResume();
        if(mStatus == STATUS_NONE) {
            startRecog();
            btnStart.performClick();
        }
    }

    @Override
    protected void initRecog() {
        IWakeupListener listener = new MyWeakUpListener();
        myWakeup = new WakeUpControl(this,listener);
    }
    private void startRecog() {
        WakeupParams wakeupParams = new WakeupParams(this);
        Map<String,Object> params = wakeupParams.fetch();
        myWakeup.start(params);
        mStatus = STATUS_WAITING_READY;
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
