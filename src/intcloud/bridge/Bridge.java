package intcloud.bridge;

import android.app.Activity;
import android.os.Bundle;

//1
import android.webkit.WebView;

public class Bridge extends Activity {
	WebView webView;
	 
 
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        webView = (WebView) findViewById(R.id.webView1);
//2
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setSupportMultipleWindows(false);
        webView.getSettings().setSupportZoom(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
//3        
   
        webView.loadUrl("file:///android_asset/www/index.html");
  
    }
    
}

