package com.example.core.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.core.BaseViewModel;

public abstract class BaseMVVMActicity<VM extends BaseViewModel,V extends ViewDataBinding> extends BaseActicity{
    protected VM mViewModel;
    protected V mV;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mV = DataBindingUtil.setContentView(this, getLayoutID());
        mV.setVariable(getVariable(),createViewModel());
        mV.setLifecycleOwner(this);
    }

    protected abstract VM createViewModel();

    /**
     *  获取数据
     * @return
     */
    protected abstract int getVariable();

    protected abstract int getLayoutID();

    protected abstract void creatViewModel();


}
