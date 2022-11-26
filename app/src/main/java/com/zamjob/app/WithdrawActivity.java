package com.zamjob.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zamjob.app.databinding.ActivityWithdrawBinding;

public class WithdrawActivity extends AppCompatActivity {
    ActivityWithdrawBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(view -> {
            onBackPressed();
        });

    }
}