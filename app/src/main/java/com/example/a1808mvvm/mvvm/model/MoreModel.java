package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.MoreEntity;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

public class MoreModel implements IModel {
    public LiveData<BaseRespEntify<MoreEntity>> getMoreData(String code){
        LoginApi o = NetTools.getInstance().create(LoginApi.class);
        return o.getMoreData(code);
    }
}
