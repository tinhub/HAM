package com.martin.hams_cuisine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import pl.droidsonroids.gif.GifImageView;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView logo,splashImg;
    TextView appName;
    GifImageView gif;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.logo_text);
        splashImg = findViewById(R.id.image);
        gif = findViewById(R.id.gif);
        lottieAnimationView = findViewById(R.id.lottie);

        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
       // lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        gif.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
}