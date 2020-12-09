package szabo.fpv.umb.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button webViewbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewbutton = findViewById(R.id.buttonWebview);

        webViewbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog  dialog = new MyDialog(MainActivity.this,"WebView","Naozaj chete spustit WebView ?") {
                    @Override
                    public void onClickPositiveBtn() {
                        Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onClickNegativeBtn() {

                    }
                };
                dialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}