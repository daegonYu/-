package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class unsepage_1 extends Activity {

    TextView textview_title, textview_birth,textview_jachukin;
    DatePicker datepicker;
    ImageButton imbtn_ok,imbtn_downarrow;
    ImageView img_loading,img_purpleball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unsepage_1);

        textview_title = (TextView) findViewById(R.id.textview_title);
        textview_birth = (TextView) findViewById(R.id.textview_birth);
        textview_jachukin = (TextView) findViewById(R.id.textview_jachukin);
        datepicker = (DatePicker) findViewById(R.id.datepicker);
        imbtn_ok = (ImageButton) findViewById(R.id.ok);
        imbtn_downarrow = (ImageButton) findViewById(R.id.imbtn_downarrow);
        //img_loading = (ImageView) findViewById(R.id.img_loading);
        img_purpleball = (ImageView) findViewById(R.id.img_purpleball);

        registerForContextMenu(textview_jachukin);
        //Glide.with(this).asGif().load(R.raw.giphy_6).diskCacheStrategy(DiskCacheStrategy.RESOURCE).into(img_loading);
        //Handler handler = new Handler();

        imbtn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intents = new Intent(getApplicationContext(), unsepage_2.class);
                startActivity(intents);

                //handler.postDelayed(new Runnable() {
                //    @Override
                //    public void run() {
                //        Intent intents = new Intent(getApplicationContext(), unsepage_2.class);
                //       startActivity(intents);
                //    }
               // },2000);

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                textview_jachukin.setText("子(자) 23:30 - 01:29");
                return true;
            case R.id.item2:
                textview_jachukin.setText("丑(축) 01:30 - 03:29");
                return true;
            case R.id.item3:
                textview_jachukin.setText("寅(인) 03:30 - 05:29");
                return true;
            case R.id.item4:
                textview_jachukin.setText("卯(묘) 05:30 - 07:29");
                return true;
            case R.id.item5:
                textview_jachukin.setText("辰(진) 07:30 - 09:29");
                return true;
            case R.id.item6:
                textview_jachukin.setText("巳(사) 09:30 - 11:29");
                return true;
            case R.id.item7:
                textview_jachukin.setText("午(오) 11:30 - 13:29");
                return true;
            case R.id.item8:
                textview_jachukin.setText("未(미) 13:30 - 15:29");
                return true;
            case R.id.item9:
                textview_jachukin.setText("申(신) 15:30 - 17:29");
                return true;
            case R.id.item10:
                textview_jachukin.setText("酉(유) 17:30 - 19:29");
                return true;
            case R.id.item11:
                textview_jachukin.setText("戌(술) 19:30 - 21:29");
                return true;
            case R.id.item12:
                textview_jachukin.setText("亥(해) 21:30 - 23:29");
                return true;
        }
        return false;
    }
}