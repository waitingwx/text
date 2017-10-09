package com.wx.baidurecdemo.contorller;

import android.content.Context;

import com.baidu.speech.EventListener;
import com.baidu.speech.EventManager;
import com.baidu.speech.EventManagerFactory;
import com.baidu.speech.asr.SpeechConstant;
import com.wx.baidurecdemo.IWakeupListener;
import com.wx.baidurecdemo.util.LogUtil;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by wx on 2017/10/9.
 */

public class WakeUpControl {


    private static boolean isInited = false;

    private EventManager wp;
    private EventListener eventListener;

    private static final String TAG = "MyWakeup";

    public WakeUpControl(Context context, EventListener eventListener) {
        if (isInited) {
            LogUtil.error(TAG,"还未调用release()，请勿新建一个新类");
            throw new RuntimeException("还未调用release()，请勿新建一个新类");
        }
        isInited = true;
        this.eventListener = eventListener;
        wp = EventManagerFactory.create(context, "wp");
        wp.registerListener(eventListener);
    }

    public WakeUpControl(Context context, IWakeupListener eventListener) {
        this(context,new WakeupEventAdapter(eventListener));
    }
    public void start(Map<String, Object> params) {
        String json = new JSONObject(params).toString();
        LogUtil.info(TAG + ".Debug", "wakeup params(反馈请带上此行日志):" + json);
        wp.send(SpeechConstant.WAKEUP_START, json, null, 0, 0);
    }

    public void stop() {
        LogUtil.info(TAG,"唤醒结束");
        wp.send(SpeechConstant.WAKEUP_STOP, null, null, 0, 0);
    }

    public void release(){
        stop();
        wp.unregisterListener(eventListener);
        wp = null;
        isInited  =false;
    }
}
