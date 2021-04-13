package com.example.imgloader;

public class ImgManager {
    private static ImgManager instance = null;
    private ImgManager() {

    }
    public static ImgManager getInstance(){
        return instance;
    }

    private CImgLoader cImgLoader;
    public void init(CImgLoader _cImgLoader){
        if (_cImgLoader==null){
//            cImgLoader = new CImgLoader.Builder()
//                    .setImgType(ImgType.GLIDE)
//                    .setContext()
//                    .setPath()
//                    .build();
        }
        else{

        }
    }

    public void show(String log){
//        clog.d(log);
    }
}
