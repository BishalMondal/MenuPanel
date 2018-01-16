package com.kgeccse.app.menupanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        String url="https://www.makemytrip.com/";
        WebView web = (WebView)findViewById(R.id.WebView);
        web.loadUrl(url);
    }
}
