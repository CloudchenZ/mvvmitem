package com.example.a1808mvvm.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a1808mvvm.BR;
import com.example.a1808mvvm.R;
import com.example.a1808mvvm.databinding.UserLoginDataBinding;
import com.example.a1808mvvm.mvvm.viewmodel.UserLoginViewModel;
import com.example.core.view.BaseMVVMActicity;

public class MainActivity extends BaseMVVMActicity<UserLoginViewModel, UserLoginDataBinding> {

    @Override
    protected UserLoginViewModel createViewModel() {
        return new UserLoginViewModel(this);
    }
    @Override
    protected int getVariable() {
        return BR.reqData;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void creatViewModel() {

    }
}
