package com.example.a1808mvvm.mvvm.model;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.LoginEntity;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

public class UserLoginModel implements IModel {
    public LiveData<BaseRespEntify<LoginEntity>> login(LoginEntity entity) {
        LoginApi api = NetTools.getInstance().create(LoginApi.class);
        return api.login(entity);
    }
}
