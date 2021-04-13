package com.example.a1808mvvm.mvvm.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.model.service.entity.FaBuEntity;
import com.example.a1808mvvm.mvvm.viewmodel.FaBuViewModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FaBuActivity extends AppCompatActivity {

    private Button button;
    private EditText ettou;
    private FaBuViewModel faBuViewModel;
    private FaBuEntity faBuEntity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fa_bu);
        initView();
        faBuViewModel = new FaBuViewModel(this);
        faBuEntity = new FaBuEntity();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String time = simpleDateFormat.format(new Date());
        faBuEntity.setCtime(time);
        faBuEntity.setId(16);
        faBuEntity.setUserid(16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = ettou.getText().toString();
                faBuEntity.setContent(s);
                faBuViewModel.sendPyq(faBuEntity);
            }
        });
    }

    private void initView() {
        button = findViewById(R.id.button);
        ettou = findViewById(R.id.ettou);
    }
}
