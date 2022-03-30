package com.example.cunema;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private WebView webView3;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView3 = findViewById(R.id.WebView);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.loadUrl("https://www.kinopoisk.ru/film/1294123");
    }
}