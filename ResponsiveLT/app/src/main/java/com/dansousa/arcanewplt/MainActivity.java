package com.dansousa.arcanewplt;

import android.app.*;
import android.os.*;
import android.webkit.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //instance of webview
        WebView main = (WebView) findViewById(R.id.webView);
        //creating a variable to change some settings on webView OBJ
        WebSettings mainSettings = main.getSettings();
        //by default the js is denied, but using this line we can use him.
        mainSettings.setJavaScriptEnabled(true);
        //seting up the webView url using a local html file
        //android_asset is the assets folder created outside others directories
        main.loadUrl("file:///android_asset/web/index.html");
    }
}
