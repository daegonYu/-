package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    ImageButton btnLotto,btnLuck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLotto = (ImageButton)findViewById(R.id.btnLotto);
        btnLuck = (ImageButton)findViewById(R.id.btnLuck);

        btnLotto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, lotto_page.class);
                startActivity(intent);
            }
        });

        btnLuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, unsepage_0.class);
                startActivity(intent);
            }
        });
    }
}