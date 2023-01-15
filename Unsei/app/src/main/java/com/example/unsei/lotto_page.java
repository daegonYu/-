package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class lotto_page extends Activity {


    Button btnRand, btnSeleted, btnReceive,btnRank;
    ImageView imgQR;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotto_page);

        btnRand = (Button) findViewById(R.id.btn_CreateRand);
        btnSeleted = (Button) findViewById(R.id.btn_CreateSeleted);
        btnReceive = (Button) findViewById(R.id.btn_RealReceive);
        btnRank = (Button) findViewById(R.id.btnRank);
        imgQR = (ImageView) findViewById(R.id.imgQR);


        btnRand.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(lotto_page.this, lotto_number.class);
                startActivity(intent);
            }
        });
        btnSeleted.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(lotto_page.this, lotto_number2.class);
                startActivity(intent);
            }
        });
        btnReceive.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(lotto_page.this, money.class);
                startActivity(intent);
            }
        });
        btnRank.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(lotto_page.this, GoogleMaps.class);
                startActivity(intent);
            }
        });
        imgQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lotto_page.this, ScanQR.class);
                startActivity(intent);
            }
        });


    }
}
