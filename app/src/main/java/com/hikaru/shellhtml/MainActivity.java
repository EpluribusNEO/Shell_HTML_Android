package com.hikaru.shellhtml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity{
    protected  WebView myWeb;
    @Override
    protected void onCreate(Bundle savedInstanceStat){
        super.onCreate(savedInstanceStat);
        setContentView(R.layout.activity_main);

        //Найти браузер
        myWeb = (WebView)findViewById(R.id.webView);

        //Настройка браузера
        myWeb.getSettings().setUseWideViewPort(true);
        myWeb.setInitialScale(1);
        myWeb.getSettings().setJavaScriptEnabled(true);

        // Load the page
        myWeb.loadUrl("file:///android_asset/index.html");
    }
}

