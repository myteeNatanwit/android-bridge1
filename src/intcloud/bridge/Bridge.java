package intcloud.bridge;

import android.app.Activity;
import android.os.Bundle;

//1
import android.webkit.WebView;
import android.annotation.SuppressLint;
   
public class Bridge extends Activity {
	WebView webView;
	 
    @SuppressLint("SetJavaScriptEnabled")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setSupportMultipleWindows(false);
        webView.getSettings().setSupportZoom(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
// 2        
   
        webView.loadUrl("file:///android_asset/www/index.html");
  
    }
    
}

