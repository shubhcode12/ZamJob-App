package com.zamjob.app.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zamjob.app.databinding.FragmentReferBinding;


public class ReferFragment extends Fragment {

    FragmentReferBinding binding;


    public ReferFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentReferBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;

    }
}