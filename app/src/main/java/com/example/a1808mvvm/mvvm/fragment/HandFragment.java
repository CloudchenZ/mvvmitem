package com.example.a1808mvvm.mvvm.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.adapter.TouAdapter;
import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.a1808mvvm.mvvm.view.FaBuActivity;
import com.example.a1808mvvm.mvvm.viewmodel.HardViewModel;
import com.example.net.BaseRespEntify;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HandFragment extends Fragment {


    private RecyclerView rvhard;
    private ImageView ivfb;

    public HandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_hand, container, false);
        rvhard = inflate.findViewById(R.id.rvhard);
        ivfb = inflate.findViewById(R.id.ivfb);
        HardViewModel hardViewModel = new HardViewModel(this);
        hardViewModel.getHardData(16).observe(this, new Observer<BaseRespEntify<List<HardEntity>>>() {
            @Override
            public void onChanged(BaseRespEntify<List<HardEntity>> hardEntityBaseRespEntify) {
                List<HardEntity> data = hardEntityBaseRespEntify.getData(HardEntity.class);
                Log.e("cym", "onChanged: " + data);
                TouAdapter touAdapter = new TouAdapter(R.layout.listtou, data);
                rvhard.setAdapter(touAdapter);
                rvhard.setLayoutManager(new LinearLayoutManager(getContext()));
            }
        });
        ivfb.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), FaBuActivity.class);
            startActivity(intent);
        }
    });
        return inflate;
    }

}