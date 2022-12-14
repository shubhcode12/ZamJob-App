package com.zamjob.app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zamjob.app.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {
    ActivitySettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.toolbar.setNavigationOnClickListener(view -> {
            onBackPressed();
        });
        binding.settingAboutUS.setOnClickListener(view -> startActivity(new Intent(this, AboutActivity.class)));
        binding.settingSupport.setOnClickListener(view -> startActivity(new Intent(this, SupportActivity.class)));
    }
}