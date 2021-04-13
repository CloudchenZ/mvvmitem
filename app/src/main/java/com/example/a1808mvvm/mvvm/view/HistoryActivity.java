package com.example.a1808mvvm.mvvm.view;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a1808mvvm.R;

public class HistoryActivity extends AppCompatActivity {

    private EditText eta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        initView();
    }

    private void initView() {
        eta = findViewById(R.id.eta);
    }
}
