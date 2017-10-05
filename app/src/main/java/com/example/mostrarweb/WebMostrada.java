package com.example.mostrarweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebMostrada extends AppCompatActivity {

    WebView wbvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_mostrada);

        wbvWeb = (WebView)findViewById(R.id.wbvWeb);
        wbvWeb.loadUrl(getIntent().getExtras().getString("webMostrada"));

    }
}
