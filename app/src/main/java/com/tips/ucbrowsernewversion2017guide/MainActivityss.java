package com.tips.ucbrowsernewversion2017guide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainss);



        int secondsDelayed = 6;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(MainActivityss.this, MainActivity.class));
                finish();

                //  ads
                // showInterstitial();
            }
        }, secondsDelayed * 1000);

    }
}
