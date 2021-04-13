package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.LoginEntity;
import com.example.a1808mvvm.mvvm.model.UserLoginModel;
import com.example.core.BaseRepository;
import com.example.net.BaseRespEntify;

public class UserLoginRepository extends BaseRepository<UserLoginModel> {
    @Override
    protected UserLoginModel createModel() {
        return new UserLoginModel();
    }
    public LiveData<BaseRespEntify<LoginEntity>> login(LoginEntity entity) {
       //判断网络状态
        return mModel.login(entity);
    }
}
