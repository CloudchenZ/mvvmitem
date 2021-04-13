package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.MoreModel;
import com.example.a1808mvvm.mvvm.model.service.entity.MoreEntity;
import com.example.core.BaseRepository;
import com.example.net.BaseRespEntify;

public class MoreRepository extends BaseRepository<MoreModel> {
    @Override
    protected MoreModel createModel() {
        return new MoreModel();
    }
    public LiveData<BaseRespEntify<MoreEntity>> getMoreData(String code){
        return mModel.getMoreData(code);
    }
}
