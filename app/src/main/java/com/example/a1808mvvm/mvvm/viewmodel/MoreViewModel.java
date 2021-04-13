package com.example.a1808mvvm.mvvm.viewmodel;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.MoreEntity;
import com.example.a1808mvvm.mvvm.repository.MoreRepository;
import com.example.core.BaseViewModel;
import com.example.net.BaseRespEntify;

public class MoreViewModel extends BaseViewModel<MoreRepository> {
    public MoreViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    @Override
    protected MoreRepository createRepository() {
        return new MoreRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }
    public LiveData<BaseRespEntify<MoreEntity>> getMoreData(String code){
        Log.e("aaa", "getMoreData: "+code );
        return mRepository.getMoreData(code);
    }
}
