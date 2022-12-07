package com.zamjob.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zamjob.app.databinding.ActivityGeneratedCodeBinding;

public class GeneratedCodeActivity extends AppCompatActivity {
    ActivityGeneratedCodeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGeneratedCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}