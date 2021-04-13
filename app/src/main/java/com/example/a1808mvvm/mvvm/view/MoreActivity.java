package com.example.a1808mvvm.mvvm.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.model.service.entity.MoreEntity;
import com.example.a1808mvvm.mvvm.viewmodel.MoreViewModel;
import com.example.net.BaseRespEntify;
import com.tencent.smtt.sdk.WebView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MoreActivity extends AppCompatActivity {
    private TextView tvMoreTitle;
    private WebView tx5;
    private TextView timeout;
    private TextView tvtime;
    private ImageView ivzz;
    private TextView tvzz;
    private int index = 0;
    private ImageView ivwjx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        initView();
        getStringDateShort();
        final Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String uid = intent.getStringExtra("uid");
        tvMoreTitle.setText(title);
        Log.e("uid", "onCreate: " + uid);
        MoreViewModel moreViewModel = new MoreViewModel(this);
        moreViewModel.getMoreData(uid).observe(this, new Observer<BaseRespEntify<MoreEntity>>() {
            @Override
            public void onChanged(BaseRespEntify<MoreEntity> moreEntityBaseRespEntify) {
                if (moreEntityBaseRespEntify.getCode() != -1) {
                    MoreEntity data = moreEntityBaseRespEntify.getData(MoreEntity.class);
                    String auth = data.getAuth();
                    timeout.setText(auth);
                    String publishtime = data.getPublishtime();
                    int dataNow = getDataNow(publishtime);
                    int years = dataNow / 12;
                    int month = dataNow % 12;
                    if (dataNow > 12) {
                        tvtime.setText(years + "年" + month + "月前");
                    } else {
                        tvtime.setText(month + "月前");
                    }
                    Log.e("asdzxc", "onChanged: " + dataNow);
                    tx5.loadUrl(data.getUrl());
                } else {
                    tx5.loadUrl("https://new.qq.com/omn/20210405/20210405A06I6W00.html");
                }

            }
        });
        ivzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                tvzz.setText(index + "");
            }
        });
        ivwjx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivwjx.setImageResource(R.drawable.ic_wjxsc);
            }
        });
    }

    private void initView() {
        tvMoreTitle = findViewById(R.id.tv_more_title);
        tx5 = findViewById(R.id.tx5);
        timeout = findViewById(R.id.timeout);
        tvtime = findViewById(R.id.tvtime);
        ivzz = findViewById(R.id.ivzz);
        tvzz = findViewById(R.id.tvzz);
        ivwjx = findViewById(R.id.ivwjx);
    }

    public static int getStringDateShort() {
        Date currentTime = new Date();
        long time = currentTime.getTime() / 86400000;
        int month = (int) (time / 30);
        return month;
    }

    public static int getDataNow(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time1 = date.getTime() / 86400000;
        int month = (int) (time1 / 30);
        int after = getStringDateShort();
        return after - month;
    }
}
