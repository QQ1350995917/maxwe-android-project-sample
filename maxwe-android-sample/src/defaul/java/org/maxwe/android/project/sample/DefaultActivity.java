package org.maxwe.android.project.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class DefaultActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
    }

    @Override
    public void onClick(View v) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    String path = "http://cloud.189.cn/open/oauth2/accessToken.action";
//                    URL url = new URL(path);
//                    HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
//                    urlConn.setConnectTimeout(5 * 1000);
//                    urlConn.connect();
//                    if (urlConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                        Log.i("TAG_GET", "Get方式请求成功，返回数据如下：");
//                    } else {
//                        Log.i("TAG_GET", "Get方式请求失败");
//                    }
//                    urlConn.disconnect();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }).start();

        Intent intent = new Intent(this, CommonActivity.class);
        startActivity(intent);

    }
}
