package com.example.pharmaappsplashscreen;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(SplashScreen.this, R.raw.alpha);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashScreen.this, PharmaApp.class);
                startActivity(i);
                appIntro.stop();
                finish();
            }
        }, 3000);
    }
}
