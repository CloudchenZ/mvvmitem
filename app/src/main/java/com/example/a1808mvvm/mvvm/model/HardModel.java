package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

import java.util.List;

public class HardModel implements IModel {
    public LiveData<BaseRespEntify<List<HardEntity>>> getHardData(int code){
        LoginApi o = NetTools.getInstance().create(LoginApi.class);
        return o.getHardData(code);
    }
}
