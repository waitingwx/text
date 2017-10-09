package com.wx.baidurecdemo.wakeup;

import android.util.Log;

import com.wx.baidurecdemo.IWakeupListener;

/**
 * Created by wx on 2017/10/9.
 */

public class MyWeakUpListener implements IWakeupListener {
    private static String TAG = "MyWeakUpListener";
    @Override
    public void onSuccess(String word, WakeUpResult result) {
        Log.d(TAG, "onSuccess: 参数：Word= "+word+"\nresult.getOrigalJson() = "+result.getOrigalJson());
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: ");
    }

    @Override
    public void onError(int errorCode, String errorMessge, WakeUpResult result) {
        Log.d(TAG, "onError: 参数：errorCode = " + errorCode +"\terrorMessge" + errorMessge+"\tresult"+result.getErrorCode());
    }

    @Override
    public void onASrAudio(byte[] data, int offset, int length) {
        Log.d(TAG, "onASrAudio: data = "+data.length +"\toffset = " +offset+ "\tlength = "+length);
    }
}
