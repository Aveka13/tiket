package com.example.cunema;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private WebView webView2;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView2 = findViewById(R.id.WebView);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("https://www.kinopoisk.ru/film/590286/");
    }
}