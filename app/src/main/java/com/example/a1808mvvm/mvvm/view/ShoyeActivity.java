package com.example.a1808mvvm.mvvm.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.adapter.HomeViewPagerAdapter;
import com.example.a1808mvvm.mvvm.fragment.HandFragment;
import com.example.a1808mvvm.mvvm.fragment.NewsFragment;
import com.example.a1808mvvm.mvvm.fragment.VideoFragment;
import com.example.core.view.BaseActicity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ShoyeActivity extends BaseActicity {

    private EditText et1;
    private BottomNavigationView bnv;
    private ViewPager vp;
    private TabLayout tabl;
    private ImageView ivbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoye);
        initView();
        bnv.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
        et1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    Intent intent = new Intent(ShoyeActivity.this, HistoryActivity.class);
                    startActivity(intent);
                } else {
                }
            }
        });
        List<Fragment> list = new ArrayList<>();
        list.add(new NewsFragment());
        list.add(new HandFragment());
        list.add(new VideoFragment());
        list.add(new VideoFragment());
        List<String> listname = new ArrayList<>();
        listname.add("关注");
        listname.add("推荐");
        listname.add("热点");
        listname.add("财经");
//        listname.add("历史");
//        listname.add("美食");
        HomeViewPagerAdapter homeViewPagerAdapter = new HomeViewPagerAdapter(getSupportFragmentManager(), list, listname);
        tabl.setupWithViewPager(vp);
        vp.setAdapter(homeViewPagerAdapter);
        ivbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupWindow popupWindow = new PopupWindow();
                popupWindow.setOutsideTouchable(true);
                View view = getLayoutInflater().inflate(R.layout.popupwindos, null);
                popupWindow.setContentView(view);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
                popupWindow.showAtLocation(tabl, Gravity.TOP,0,0);
            }
        });
    }

    private void initView() {
        et1 = findViewById(R.id.et1);
        bnv = findViewById(R.id.bnv);
        vp = findViewById(R.id.vp);
        tabl = findViewById(R.id.tabl);
        ivbt = findViewById(R.id.ivbt);
    }
}
