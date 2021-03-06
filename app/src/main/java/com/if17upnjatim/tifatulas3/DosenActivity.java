package com.if17upnjatim.tifatulas3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class DosenActivity extends AppCompatActivity {
    WebView wv;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dosen);
        this.setTitle("Profil Dosen");

        URL = "http://ifupnjatim.ac.id/progditf/staff/#dosen";

        wv= (WebView)findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(URL);
        wv.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if(wv.canGoBack()){
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
