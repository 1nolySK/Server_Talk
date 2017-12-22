package com.example.dell.server;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DELL on 11-Dec-17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Intent mInHome = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mInHome);
                SplashActivity.this.finish();
            }
        }, 1500);
    }
}
