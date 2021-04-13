package com.example.a1808mvvm.mvvm.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.FaBuEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.FaSoResultEntity;
import com.example.a1808mvvm.mvvm.repository.FaBuRepository;
import com.example.core.BaseViewModel;
import com.example.net.BaseRespEntify;

public class FaBuViewModel extends BaseViewModel<FaBuRepository> {
    public FaBuViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    @Override
    protected FaBuRepository createRepository() {
        return new FaBuRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }
    public LiveData<BaseRespEntify<FaSoResultEntity>> sendPyq(FaBuEntity faBuEntity){
        return mRepository.sendPyq(faBuEntity);
    }
}
