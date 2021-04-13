package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.FaBuModel;
import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.FaBuEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.FaSoResultEntity;
import com.example.core.BaseRepository;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

public class FaBuRepository extends BaseRepository<FaBuModel> {
    @Override
    protected FaBuModel createModel() {
        return new FaBuModel();
    }
    public LiveData<BaseRespEntify<FaSoResultEntity>> sendPyq(FaBuEntity faBuEntity){
        return mModel.sendPyq(faBuEntity);
    }
}
