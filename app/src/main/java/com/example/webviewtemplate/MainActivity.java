package com.example.webviewtemplate;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String asset = "file:///android_asset/index.html";
        WebView webview = findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(asset);

        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setAllowContentAccess(true);

        webview.setWebChromeClient(new WebChromeClient() {
        });
    }
}