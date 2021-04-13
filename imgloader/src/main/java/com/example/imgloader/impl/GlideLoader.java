package com.example.imgloader.impl;

import android.content.Context;
import android.widget.ImageView;

import com.example.imgloader.CymImg;

public class GlideLoader implements CymImg {
    private Context context;
    private String path;
    private ImageView imageView;


    @Override
    public void setView(Context context) {
        this.context = context;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void setImgView(ImageView imgView) {
        this.imageView = imgView;
    }
}
