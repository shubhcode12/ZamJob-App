package com.zamjob.app.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import com.zamjob.app.databinding.FragmentWalletBinding;

public class WalletFragment extends Fragment {

    private FragmentWalletBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentWalletBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition() == 0){
                    //Toast.makeText(getActivity(), "Transactions", Toast.LENGTH_SHORT).show();
                    binding.LinTrans.setVisibility(View.VISIBLE);
                    binding.LinReedem.setVisibility(View.GONE);

                    /*uncomment this later*/
//                    binding.rvTransactions.setVisibility(View.VISIBLE);
//                    binding.rvReedemed.setVisibility(View.GONE);
                }else if(tab.getPosition() == 1){
                   // Toast.makeText(getActivity(), "Reeedemed", Toast.LENGTH_SHORT).show();
                    binding.LinReedem.setVisibility(View.VISIBLE);
                    binding.LinTrans.setVisibility(View.GONE);

                    /*uncomment this later*/
//                    binding.rvReedemed.setVisibility(View.VISIBLE);
//                    binding.rvTransactions.setVisibility(View.GONE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return root;
    }

    @Override
    public void onStart() {
        binding.tab.getTabAt(1).select();
        super.onStart();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}