package com.example.a1808mvvm.mvvm.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;
import com.example.a1808mvvm.mvvm.repository.NewsRepository;
import com.example.core.BaseViewModel;
import com.example.net.BaseRespEntify;

import java.util.List;

public class NewsViewModel extends BaseViewModel<NewsRepository> {

    public NewsViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    @Override
    protected NewsRepository createRepository() {
        return new NewsRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }
    public LiveData<BaseRespEntify<List<NewsEntity>>> getNewsData(){
        return mRepository.getNewData();
    }
}
