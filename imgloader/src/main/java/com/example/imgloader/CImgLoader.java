package com.example.imgloader;

import android.content.Context;
import android.widget.ImageView;

import com.example.imgloader.impl.GlideLoader;
import com.example.imgloader.impl.PicassoLoader;

public class CImgLoader {
    private CymImg cymImg = null;
    private ImgType imgType;
    private Context context;
    private String path;
    private ImageView imageView;

    public CImgLoader(Context context, String path, ImageView imageView) {
        this.context = context;
        this.path = path;
        this.imageView = imageView;


    }

    public CImgLoader(ImgType imgType, Context context, String path, ImageView imageView) {
        this.imgType = imgType;
        this.context = context;
        this.path = path;
        this.imageView = imageView;

        setLogType(this.imgType);
        setContext(this.context);
        setPath(this.path);
        setImageView(this.imageView);
    }

    public void setLogType(ImgType _type){
        switch (_type){
            case PICASSO:
                cymImg = new PicassoLoader();
                break;
            case GLIDE:
                cymImg = new GlideLoader();
                break;
        }
    }

    private void setContext(Context _context){
        cymImg.setView(_context);
    }

    private void setPath(String _path){
        cymImg.setPath(_path);
    }

    private void setImageView(ImageView _imageview){
        cymImg.setImgView(_imageview);
    }

    public static final class Builder{
        private ImgType mType;
        private Context context;
        private String path;
        private ImageView imageView;

        public Builder setImgType(ImgType _type){
            mType = _type;
            return this;
        }

        public Builder setContext(Context _context){
            context = _context;
            return this;
        }

        public Builder setPath(String _path){
            path = _path;
            return this;
        }

        public CImgLoader build(){
            return new CImgLoader(mType,context,path,imageView);
        }
    }
}
