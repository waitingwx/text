package com.wx.baidurecdemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by wx on 2017/10/9.
 */

public abstract class CommonActivity extends AppCompatActivity {
    protected int layoutId = R.layout.activity_common;
    protected Button btnSetting;
    protected Class settingActivityClass = null;
    private static String TAG ="CommonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ????");
        setContentView(layoutId);
        initView();
        initPermission();
        initRecog();
        Log.d(TAG, "onCreate: >>>>>");
    }
    protected void initView(){
        btnSetting = ((Button) findViewById(R.id.btn_setting));
        if (btnSetting != null && settingActivityClass != null) {
            btnSetting.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(CommonActivity.this, settingActivityClass);
                    startActivity(intent);
                }
            });
        }

    }
    protected abstract void initRecog();
    protected void initPermission() {
        String permissions[] = {Manifest.permission.RECORD_AUDIO,
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.INTERNET,
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };

        ArrayList<String> toApplyList = new ArrayList<String>();

        for (String perm :permissions){
            if (PackageManager.PERMISSION_GRANTED != ContextCompat.checkSelfPermission(this, perm)) {
                toApplyList.add(perm);
                //进入到这里代表没有权限.

            }
        }
        String tmpList[] = new String[toApplyList.size()];
        if (!toApplyList.isEmpty()){
            ActivityCompat.requestPermissions(this, toApplyList.toArray(tmpList), 123);
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        // 此处为android 6.0以上动态授权的回调，用户自行实现。
    }
}
