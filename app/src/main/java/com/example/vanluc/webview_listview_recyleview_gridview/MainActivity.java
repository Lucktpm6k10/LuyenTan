package com.example.vanluc.webview_listview_recyleview_gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRyclerView,btnWebView,btn_MultiLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRyclerView = findViewById(R.id.btnRycler);
        btnWebView = findViewById(R.id.btnWebView);
        btn_MultiLanguage = findViewById(R.id.btnMultiLanguage);

        btnRyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this,RecyclerView.class);
                startActivity(intent);
            }
        });
        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        btn_MultiLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MutiLanguageActivity.class);
                startActivity(intent);
            }
        });

    }
}
