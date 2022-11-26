package com.zamjob.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zamjob.app.databinding.ActivityWithdrawBinding;

public class WithdrawActivity extends AppCompatActivity {
    ActivityWithdrawBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWithdrawBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}