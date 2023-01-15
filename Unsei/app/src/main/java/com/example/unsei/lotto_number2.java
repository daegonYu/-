package com.example.unsei;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.graphics.Bitmap;




import java.util.ArrayList;
import java.util.Random;

import java.util.TreeMap;
import java.util.TreeSet;


public class lotto_number2 extends Activity {
    LinearLayout ll, ll2;
    ArrayList<Bitmap> lottoBalls;
    ImageButton bt, bt2;
    EditText edit1, edit2, edit3, edit4, edit5;
    String num1, num2, num3, num4, num5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotto_number2);

        lottoBalls = new ArrayList<>();
        Resources res = getResources();

        for(int i=0; i<45; i++) {
            int tmpid = getResources().getIdentifier(
                    "i" + (i+1), "drawable", getPackageName());

            Bitmap bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, tmpid), 180, 180, false);

            lottoBalls.add(bitmap);
        }

        ll = findViewById(R.id.ll);
        ll2 = findViewById(R.id.ll2);

        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        ll.setLayoutParams(params);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll2.setLayoutParams(params2);
        ll2.setOrientation(LinearLayout.VERTICAL);

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);
        edit3 = findViewById(R.id.Edit3);
        edit4 = findViewById(R.id.Edit4);
        edit5 = findViewById(R.id.Edit5);

        bt = findViewById(R.id.bt);
        bt2 = findViewById(R.id.bt2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ll.getChildCount() > 0) ll.removeAllViews();
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                num3 = edit3.getText().toString();

                TreeSet<Integer> set = new TreeSet();

                while(set.size() < Integer.parseInt(num1)) {
                    int random = (int) (Math.random() * (Integer.parseInt(num3)-Integer.parseInt(num2))+Integer.parseInt(num2));
                    set.add(random);
                }
                for(Integer i:set) {
                    ImageView lottoBallView = new ImageView(ll.getContext());
                    lottoBallView.setImageBitmap(lottoBalls.get(i));
                    ll.addView(lottoBallView);
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ll2.getChildCount() > 0) ll2.removeAllViews();
                num4 = edit4.getText().toString();
                num5 = edit5.getText().toString();

                int random = (int) (Math.random() * (Integer.parseInt(num5)-Integer.parseInt(num4))+Integer.parseInt(num4));

                ImageView lottoBallView = new ImageView(ll2.getContext());
                lottoBallView.setImageBitmap(lottoBalls.get(random));
                ll2.addView(lottoBallView);
            }
        });
    }

}