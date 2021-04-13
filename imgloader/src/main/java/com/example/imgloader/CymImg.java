package com.example.imgloader;

import android.content.Context;
import android.widget.ImageView;

public interface CymImg {
    void setView(Context context);
    void setPath(String path);
    void setImgView(ImageView imgView);
}
