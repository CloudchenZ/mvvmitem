package com.example.a1808mvvm.mvvm.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.a1808mvvm.mvvm.repository.HardRepository;
import com.example.core.BaseViewModel;
import com.example.net.BaseRespEntify;

import java.util.List;

public class HardViewModel extends BaseViewModel<HardRepository> {
    public HardViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    @Override
    protected HardRepository createRepository() {
        return new HardRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }

    public LiveData<BaseRespEntify<List<HardEntity>>> getHardData(int code){
       return mRepository.getHardData(code);
    };
}
