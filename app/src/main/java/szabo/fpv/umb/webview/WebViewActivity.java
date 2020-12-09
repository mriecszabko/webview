package szabo.fpv.umb.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        startWebView();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void startWebView(){
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.fpv.umb.sk");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//enable javascript on website

    }

    @Override
    public void onBackPressed() {
        //can back on website
        if(webView.canGoBack()){
            webView.goBack();
        }
        //no more back on website go back on activity
        else {
            super.onBackPressed();
        }

    }
}