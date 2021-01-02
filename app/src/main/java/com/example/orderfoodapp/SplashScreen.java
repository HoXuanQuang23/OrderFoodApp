package com.example.orderfoodapp;

import android.content.Intent;
import android.os.Handler;

public class SplashScreen extends BaseActivity {

    @Override
    protected void inititalViewComponent() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, HomeActivity.class));
                finish();
            }
        }, 1000);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.splash_screen;
    }
}
