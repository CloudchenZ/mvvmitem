package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.NewTypeModel;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.core.BaseRepository;
import com.example.net.BaseRespEntify;
import com.google.gson.internal.LinkedTreeMap;

public class NewsTypeRepository extends BaseRepository<NewTypeModel> {
    @Override
    protected NewTypeModel createModel() {
        return new NewTypeModel();
    }

    public LiveData<BaseRespEntify<NewsTypeEntity>> getNewType(){
        return mModel.getNewType();
    }
}
