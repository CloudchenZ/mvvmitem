package com.example.a1808mvvm.mvvm.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.a1808mvvm.mvvm.repository.NewsTypeRepository;
import com.example.core.BaseViewModel;
import com.example.core.view.BaseActicity;
import com.example.net.BaseRespEntify;
import com.google.gson.internal.LinkedTreeMap;

public class NewsTypeViewModel extends BaseViewModel<NewsTypeRepository> {
    public NewsTypeViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    public LiveData<BaseRespEntify<NewsTypeEntity>> getNewType(){
        return mRepository.getNewType();
    }

    @Override
    protected NewsTypeRepository createRepository() {
        return new NewsTypeRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }
}
