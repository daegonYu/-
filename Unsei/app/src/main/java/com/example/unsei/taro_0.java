package com.example.unsei;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.unsei.MainActivity;
import com.example.unsei.R;

import java.util.Random;

public class taro_0 extends Activity {

    Random random = new Random();
    int num = random.nextInt(21);
    int imageResource;
    String name_taro = "drawable/t"+Integer.toString(num);
    static int p=0;

    ImageButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
    ImageButton c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40;
    ImageView img_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taro_0);
        Handler handler = new Handler();

        img_main = (ImageView) findViewById(R.id.img_main);
        c1 = (ImageButton) findViewById(R.id.c1); c2 = (ImageButton) findViewById(R.id.c2); c3 = (ImageButton) findViewById(R.id.c3);
        c4 = (ImageButton) findViewById(R.id.c4); c5 = (ImageButton) findViewById(R.id.c5); c6 = (ImageButton) findViewById(R.id.c6);
        c7 = (ImageButton) findViewById(R.id.c7); c8 = (ImageButton) findViewById(R.id.c8); c9 = (ImageButton) findViewById(R.id.c9);
        c10 = (ImageButton) findViewById(R.id.c10); c11 = (ImageButton) findViewById(R.id.c11); c12 = (ImageButton) findViewById(R.id.c12);
        c13 = (ImageButton) findViewById(R.id.c13); c14 = (ImageButton) findViewById(R.id.c14); c15 = (ImageButton) findViewById(R.id.c15);
        c16 = (ImageButton) findViewById(R.id.c16); c17 = (ImageButton) findViewById(R.id.c17); c18 = (ImageButton) findViewById(R.id.c18);
        c19 = (ImageButton) findViewById(R.id.c19); c20 = (ImageButton) findViewById(R.id.c20); c21 = (ImageButton) findViewById(R.id.c21);
        c22 = (ImageButton) findViewById(R.id.c22); c23 = (ImageButton) findViewById(R.id.c23); c24 = (ImageButton) findViewById(R.id.c24);
        c25 = (ImageButton) findViewById(R.id.c25); c26 = (ImageButton) findViewById(R.id.c26); c27 = (ImageButton) findViewById(R.id.c27);
        c28 = (ImageButton) findViewById(R.id.c28); c29 = (ImageButton) findViewById(R.id.c29); c30 = (ImageButton) findViewById(R.id.c30);
        c31 = (ImageButton) findViewById(R.id.c31); c32 = (ImageButton) findViewById(R.id.c32); c33 = (ImageButton) findViewById(R.id.c33);
        c34 = (ImageButton) findViewById(R.id.c34); c35 = (ImageButton) findViewById(R.id.c35); c36 = (ImageButton) findViewById(R.id.c36);
        c37 = (ImageButton) findViewById(R.id.c37); c38 = (ImageButton) findViewById(R.id.c38); c39 = (ImageButton) findViewById(R.id.c39);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this, taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });
        c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageResource = getResources().getIdentifier(name_taro, null, getPackageName());
                img_main.setImageResource(imageResource);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent_taro1 = new Intent(taro_0.this , taro_1.class); //화면 전환
                        intent_taro1.putExtra("key01", name_taro);
                        startActivity(intent_taro1);
                        finish();
                    }
                }, 2000); //딜레이 타임 조절
            }
        });

        }
    }
