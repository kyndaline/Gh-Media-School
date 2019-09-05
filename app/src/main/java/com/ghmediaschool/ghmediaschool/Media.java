package com.ghmediaschool.ghmediaschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Media extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);


        WebView wv = (WebView) findViewById(R.id.WebView);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://ghmediaschool.edu.gh");

            WebSettings webSettings = wv.getSettings();
            webSettings.setJavaScriptEnabled(true);

        }



    }

