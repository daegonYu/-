package com.example.unsei;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class unsepage_2 extends Activity {

    TextView textview_content1, textview_content2, textview_chongun, textview_moneyun, textview_juje;
    long now;
    Date mDate;
    SimpleDateFormat mFormat;
    ImageView img_chongun, img_moneyun;
    String content1_file,content2_file;
    Random num = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unsepage_2);

        textview_content1 = (TextView) findViewById(R.id.textview_content1);
        textview_content2 = (TextView) findViewById(R.id.textview_content2);
        textview_chongun = (TextView) findViewById(R.id.textview_chongun);
        textview_moneyun = (TextView) findViewById(R.id.textview_moneyun);
        //textview_juje = (TextView) findViewById(R.id.textview_juje);
        img_chongun = (ImageView) findViewById(R.id.img_chongun);
        img_moneyun = (ImageView) findViewById(R.id.img_moneyun);

        content1_file = "a" + Integer.toString(num.nextInt(51)); //총운
        content2_file = "z" + Integer.toString(num.nextInt(51)); //금전운
        try {
            //총운 textview
            InputStream content1_input = getResources().openRawResource(
                    getResources().getIdentifier(content1_file,
                            "raw", getPackageName()));
            byte[] content1_txt = new byte[content1_input.available()];
            content1_input.read(content1_txt);
            textview_chongun.setText("총운");
            //textview_juje.setText(new String(juje_txt));
            textview_content1.setText(getTime()+new String(content1_txt));
            content1_input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // 금전운 textview
            InputStream content2_input = getResources().openRawResource(
                    getResources().getIdentifier(content2_file,
                            "raw", getPackageName()));
            byte[] content2_txt = new byte[content2_input.available()];
            content2_input.read(content2_txt);
            textview_moneyun.setText("금전운");
            //textview_juje.setText(new String(juje_txt));
            textview_content2.setText(new String(content2_txt));
            content2_input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //현재 달,일 가져오는 함수
    private String getTime(){
        now = System.currentTimeMillis();
        mDate = new Date(now);
        mFormat = new SimpleDateFormat("MM월 dd일");
        return mFormat.format(mDate);
    }
}
