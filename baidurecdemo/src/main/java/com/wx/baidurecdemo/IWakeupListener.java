package com.wx.baidurecdemo;

import com.wx.baidurecdemo.wakeup.WakeUpResult;

/**
 * Created by wx on 2017/10/9.
 */

public interface IWakeupListener {


    void onSuccess(String word, WakeUpResult result);

    void onStop();

    void onError(int errorCode, String errorMessge, WakeUpResult result);

    void onASrAudio(byte[] data, int offset, int length);
}
