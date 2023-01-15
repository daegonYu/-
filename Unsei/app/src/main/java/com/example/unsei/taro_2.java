package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



import java.io.IOException;
import java.io.InputStream;

public class taro_2 extends Activity {

    String main_taro,name;
    TextView textview_tarocontent,textview_cardcontent;
    ImageView img_selecttaro;
    String tarocontent_file,cardcontent_file;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taro_2);

        img_selecttaro = (ImageView) findViewById(R.id.img_selecttaro);
        textview_tarocontent = (TextView) findViewById(R.id.textview_tarocontent);
        textview_cardcontent = (TextView) findViewById(R.id.textview_cardcontent);


        img_selecttaro.setVisibility(View.VISIBLE);
        Intent receive_intent = getIntent();  //intent 받아오기
        main_taro = receive_intent.getStringExtra("key02"); //받아온 값 저장
        int imageResource = getResources().getIdentifier(main_taro, null, getPackageName()); // 그림 불러오기
        img_selecttaro.setImageResource(imageResource); // 그림 보여주기

        String[] na = main_taro.split("t");
        name = na[1];

        tarocontent_file = "j" + name;
        cardcontent_file = "h" + name;

        try {
            InputStream content1_input = getResources().openRawResource(
                    getResources().getIdentifier(tarocontent_file,
                            "raw", getPackageName()));
            byte[] content1_txt = new byte[content1_input.available()];
            content1_input.read(content1_txt);
            textview_tarocontent.setText(new String(content1_txt));
            content1_input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // 금전운 textview
            InputStream content2_input = getResources().openRawResource(
                    getResources().getIdentifier(cardcontent_file,
                            "raw", getPackageName()));
            byte[] content2_txt = new byte[content2_input.available()];
            content2_input.read(content2_txt);
            textview_cardcontent.setText("당신의 운을 알려줄 카드로 '"+new String(content2_txt)+"' 카드를 선택하셨습니다.");
            content2_input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}