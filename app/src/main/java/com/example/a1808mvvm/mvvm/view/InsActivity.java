package com.example.a1808mvvm.mvvm.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.cymviews.StreamLayout;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.a1808mvvm.mvvm.viewmodel.NewsTypeViewModel;
import com.example.core.BaseViewModel;
import com.example.core.view.BaseMVVMActicity;
import com.example.net.BaseRespEntify;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

public class InsActivity extends AppCompatActivity {

    private Button bt1;
    private StreamLayout cyma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ins);
        int taskId = getTaskId();
        Log.e("wv1", "onCreate: "+taskId );
        NewsTypeViewModel newsTypeViewModel = new NewsTypeViewModel(this);
        LiveData<BaseRespEntify<NewsTypeEntity>> newType = newsTypeViewModel.getNewType();
        newType.observe(this, new Observer<BaseRespEntify<NewsTypeEntity>>() {
            @Override
            public void onChanged(BaseRespEntify<NewsTypeEntity> newsTypeEntityBaseRespEntify) {

                List<NewsTypeEntity.DataBean> data = (List<NewsTypeEntity.DataBean>) newsTypeEntityBaseRespEntify.getData();
                Log.e("wyd",newsTypeEntityBaseRespEntify.getData()+"");
            }
        });

        initView();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsActivity.this, ShoyeActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        bt1 = findViewById(R.id.bt1);
        cyma = findViewById(R.id.cyma);
    }
}
