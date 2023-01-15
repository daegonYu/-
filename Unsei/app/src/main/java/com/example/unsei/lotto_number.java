package com.example.unsei;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.graphics.Bitmap;




import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class lotto_number extends Activity {
    LinearLayout ll, ll2;
    ArrayList<Bitmap> lottoBalls;
    ImageButton bt, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotto_number);

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

        bt = findViewById(R.id.bt);
        bt2 = findViewById(R.id.bt2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ll.getChildCount() > 0) ll.removeAllViews();

                TreeSet<Integer> set = new TreeSet();

                while(set.size() < 6) {
                    int random = new Random().nextInt(45);
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

                int random = new Random().nextInt(45);

                ImageView lottoBallView = new ImageView(ll2.getContext());
                lottoBallView.setImageBitmap(lottoBalls.get(random));
                ll2.addView(lottoBallView);
            }
        });
    }

}