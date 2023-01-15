package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.unsei.R;

public class taro_1 extends Activity {

    String main_taro;
    ImageView img_tarocard; //타로 보여주는 곳
    ImageButton imbtn_tarobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taro_1);

        img_tarocard = (ImageView) findViewById(R.id.img_tarocard);
        imbtn_tarobtn = (ImageButton) findViewById(R.id.imbtn_tarobtn);

        img_tarocard.setVisibility(View.VISIBLE);
        Intent receive_intent = getIntent();  //intent 받아오기
        main_taro = receive_intent.getStringExtra("key01"); //받아온 값 저장
        int imageResource = getResources().getIdentifier(main_taro, null, getPackageName()); // 그림 불러오기
        img_tarocard.setImageResource(imageResource); // 그림 보여주기

        imbtn_tarobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_taro2 = new Intent(taro_1.this, taro_2.class); //화면 전환
                intent_taro2.putExtra("key02", main_taro);
                startActivity(intent_taro2);
            }
        });
    }
}
