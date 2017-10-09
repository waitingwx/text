package com.wx.alltestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SignInActivity extends AppCompatActivity {
    OkHttpClient client = new OkHttpClient();
    String text;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        tvResult = ((TextView) findViewById(R.id.tv_result));
    }

    public void begin_get(View view) {
        Request request1 = new Request.Builder()
                .url("http://api.kaolafm.com/api/v4/pagecontent/list?pageid=105&timezone=28800&installid=10000&udid=df89950db6c8b27b94e3112145a9217b&sessionid=df89950db6c8b27b94e3112145a9217b1464066900244&imsi=310260000000000&operator=0&lon=0.0&lat=0.0&network=1&timestamp=1464067059&sign=89f2b488d14f006f11f7fb61199b7cd5&resolution=768*1280&devicetype=0&channel=upgrade&version=4.8.1&appid=0")
                .cacheControl(new CacheControl.Builder().maxStale(1, TimeUnit.MINUTES).build())
                .build();

        Call call1 = client.newCall(request1);

        call1.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("print", "Error------------->" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                Log.d("print", "----->" + result);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tvResult.setText("");
                        tvResult.setText(result);
                    }
                });
            }
        });
    }

    public void show_bean(View view) {
        Request request1 = new Request.Builder()
                .url("http://api.kaolafm.com/api/v4/pagecontent/list?pageid=105&timezone=28800&installid=10000&udid=df89950db6c8b27b94e3112145a9217b&sessionid=df89950db6c8b27b94e3112145a9217b1464066900244&imsi=310260000000000&operator=0&lon=0.0&lat=0.0&network=1&timestamp=1464067059&sign=89f2b488d14f006f11f7fb61199b7cd5&resolution=768*1280&devicetype=0&channel=upgrade&version=4.8.1&appid=0")
                .cacheControl(new CacheControl.Builder().maxStale(1, TimeUnit.MINUTES).build())
                .build();

        Call call1 = client.newCall(request1);

        call1.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("print", "Error------------->" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                Log.d("print", "----->" + result);
                KaolaBean kaolaBean = KaolaBean.objectFromData(result);
                final List<RowBean> dataList = kaolaBean.getResult().getDataList();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tvResult.setText("");
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < dataList.size(); i++) {
                            String s = dataList.get(i).toString();
                            sb.append(s+"\n");
                        }
                        tvResult.setText(sb.toString());
                    }
                });
            }
        });
    }

}
