package com.ghmediaschool.ghmediaschool;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Login extends AppCompatActivity {
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        WebView wv = (WebView) findViewById(R.id.wv);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://portal.ghmediaschool.edu.gh");

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }


}
