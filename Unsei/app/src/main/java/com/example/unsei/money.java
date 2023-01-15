package com.example.unsei;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;




public class money extends Activity {
    EditText edit;
    LinearLayout ll;
    ImageButton btn;
    String num1;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money);


        ll = findViewById(R.id.ll);
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        ll.setLayoutParams(params);
        ll.setOrientation(LinearLayout.VERTICAL);

        edit = findViewById(R.id.Edit1);

        btn = findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ll.getChildCount() > 0) ll.removeAllViews();
                num1 = edit.getText().toString();
                //num = Integer.parseInt(num1);
                if (Integer.parseInt(num1) >= 300000000) {
                    result = (int) (Integer.parseInt(num1) * 0.67);

                }
                else if (Integer.parseInt(num1) > 50000 && Integer.parseInt(num1) < 300000000) {
                    result = (int) (Integer.parseInt(num1) * 0.78);
                }
                TextView moneyview = new TextView(ll.getContext());
                moneyview.setText("실수령액은 " + result.toString());
                moneyview.setTextSize(30);
                moneyview.setTextColor(Color.RED);
                moneyview.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

                ll.addView(moneyview);
            }
        });
    }
}