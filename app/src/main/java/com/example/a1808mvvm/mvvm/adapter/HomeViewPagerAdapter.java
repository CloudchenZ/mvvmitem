package com.example.a1808mvvm.mvvm.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> list ;
    List<String> listword ;

    public HomeViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> list, List<String> listword) {
        super(fm);
        this.list = list;
        this.listword = listword;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listword.get(position);
    }
}
