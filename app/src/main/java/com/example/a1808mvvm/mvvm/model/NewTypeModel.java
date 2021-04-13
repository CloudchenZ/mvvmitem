package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;
import com.google.gson.internal.LinkedTreeMap;

public class NewTypeModel implements IModel {

    public LiveData<BaseRespEntify<NewsTypeEntity>> getNewType(){
        LoginApi o = NetTools.getInstance().create(LoginApi.class);
        return o.getNewsType();
    }

}
