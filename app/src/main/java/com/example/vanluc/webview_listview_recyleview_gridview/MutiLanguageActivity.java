package com.example.vanluc.webview_listview_recyleview_gridview;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MutiLanguageActivity extends AppCompatActivity {
    Button btn_TiengViet,btn_TiengAnh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muti_language);
        btn_TiengAnh = findViewById(R.id.btnTiengAnh);
        btn_TiengViet = findViewById(R.id.btnTiengViet);
        btn_TiengViet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoiNgonNgu("vi");
            }
        });
        btn_TiengAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoiNgonNgu("en");
            }
        });
    }
    public void DoiNgonNgu(String language)
    {
        Locale locale = new Locale(language);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration,
                                                            getBaseContext().getResources().getDisplayMetrics());
        Intent intent = new Intent(MutiLanguageActivity.this,MutiLanguageActivity.class);
        startActivity(intent);
    }
}
