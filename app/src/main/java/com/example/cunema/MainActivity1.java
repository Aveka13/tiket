package com.example.cunema;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity1 extends AppCompatActivity {
    private WebView webView1;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        webView1 = findViewById(R.id.WebView);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("https://www.kinopoisk.ru/film/1309570/");
    }
}