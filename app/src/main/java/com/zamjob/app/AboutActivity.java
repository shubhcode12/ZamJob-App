package com.zamjob.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zamjob.app.databinding.ActivityAboutBinding;

public class AboutActivity extends AppCompatActivity {
    ActivityAboutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.toolbar.setNavigationOnClickListener(view -> {
            onBackPressed();
        });

    }
}