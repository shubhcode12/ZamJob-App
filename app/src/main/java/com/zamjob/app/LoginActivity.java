package com.zamjob.app;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.zamjob.app.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}