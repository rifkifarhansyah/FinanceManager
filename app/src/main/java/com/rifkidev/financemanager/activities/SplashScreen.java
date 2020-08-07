package com.rifkidev.financemanager.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
/*

        25/06/2020
        splash screen

        nim   : 10117193
        nama  : Rifki Farhansyah
        kelas : if-5

        */

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                // close splash activity
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}