package com.zamjob.app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.zamjob.app.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());

        Animation animSlideInRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_in_right);
        Animation animSlideInLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_in_left);
        Animation animSlideInTopt = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_in_top);

        binding.shape1.setAnimation(animSlideInTopt);
        binding.shape2.setAnimation(animSlideInLeft);
        binding.shape3.setAnimation(animSlideInRight);
        binding.shape4.setAnimation(animSlideInLeft);


        binding.btnSkip.setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });

    }
}