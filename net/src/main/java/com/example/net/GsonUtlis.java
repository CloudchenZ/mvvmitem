package com.example.net;

import com.google.gson.Gson;

public class GsonUtlis {
    private Gson gson;
    private GsonUtlis(){

    }
    private static class GsonUtilsHandler{
        private static GsonUtlis instance = new GsonUtlis();
    }

    public static GsonUtlis getInstance(){
        return GsonUtilsHandler.instance;
    }

    public synchronized Gson getGson(){
        if (gson==null){
            gson = new Gson();
        }
        return gson;
    }
}
