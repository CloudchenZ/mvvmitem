package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.FaBuEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.FaSoResultEntity;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

public class FaBuModel implements IModel {
    public LiveData<BaseRespEntify<FaSoResultEntity>> sendPyq(FaBuEntity faBuEntity){
        LoginApi o = NetTools.getInstance().create(LoginApi.class);
        return o.sendPyq(faBuEntity);
    }
}
