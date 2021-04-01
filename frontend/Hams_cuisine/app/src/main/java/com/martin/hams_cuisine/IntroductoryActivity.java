package com.martin.hams_cuisine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import pl.droidsonroids.gif.GifImageView;

public class IntroductoryActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 6000;
    ImageView logo,splashImg;
    TextView appName;
    GifImageView gif;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_introductory);


        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.logo_text);
        splashImg = findViewById(R.id.image);
        gif = findViewById(R.id.gif);
        //lottieAnimationView = findViewById(R.id.lottie);

        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(5000);
        logo.animate().translationY(1600).setDuration(1000).setStartDelay(5000);
        appName.animate().translationY(1400).setDuration(1000).setStartDelay(5000);
       // lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        gif.animate().translationY(1400).setDuration(1000).setStartDelay(5000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroductoryActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}