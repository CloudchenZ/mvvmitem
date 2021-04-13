package com.example.a1808mvvm.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.NewsModel;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.core.BaseRepository;
import com.example.core.IModel;
import com.example.net.BaseRespEntify;

import java.util.List;

public class NewsRepository extends BaseRepository<NewsModel> {

    @Override
    protected NewsModel createModel() {
        return new NewsModel();
    }
    public LiveData<BaseRespEntify<List<NewsEntity>>> getNewData(){
        return mModel.getNewsData();
    }
}
