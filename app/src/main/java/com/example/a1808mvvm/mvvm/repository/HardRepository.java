package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.HardModel;
import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.core.BaseRepository;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

import java.util.List;

public class HardRepository extends BaseRepository<HardModel> {
    @Override
    protected HardModel createModel() {
        return new HardModel();
    }
    public LiveData<BaseRespEntify<List<HardEntity>>> getHardData(int code){
        return mModel.getHardData(code);
    }
}
