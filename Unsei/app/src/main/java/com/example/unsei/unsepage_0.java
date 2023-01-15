package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class unsepage_0 extends Activity {

    TextView textview_mtitle1;
    ImageButton btn_unse, btn_taro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unsepage_0);

        textview_mtitle1 = (TextView) findViewById(R.id.textview_mtitle1);
        btn_taro = (ImageButton) findViewById(R.id.btn_taro);
        btn_unse = (ImageButton) findViewById(R.id.btn_unse);

        textview_mtitle1.setText("운세와 타로 선택해보거라!");

        btn_unse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), unsepage_1.class);
                startActivity(intent);
            }
        });

        btn_taro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), taro_0.class);
                startActivity(intent);
            }
        });

    }
}