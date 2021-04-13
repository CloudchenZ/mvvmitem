package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;
import com.example.core.BaseRepository;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

import java.util.List;

public class NewsModel implements IModel {
    public LiveData<BaseRespEntify<List<NewsEntity>>> getNewsData(){
        LoginApi o = NetTools.getInstance().create(LoginApi.class);
        return o.getNewsData(1,1,20);
    }
}
