package com.zamjob.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zamjob.app.databinding.ActivityReferBinding;

public class ReferActivity extends AppCompatActivity {
    ActivityReferBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReferBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.toolbar.setNavigationOnClickListener(view -> {
            onBackPressed();
        });

    }
}