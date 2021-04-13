package com.example.a1808mvvm.mvvm.viewmodel;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.example.a1808mvvm.mvvm.model.service.entity.LoginEntity;
import com.example.a1808mvvm.mvvm.repository.UserLoginRepository;
import com.example.core.BaseViewModel;
import com.example.log.CLog;
import com.example.log.CLogManager;
import com.example.log.LogLevel;
import com.example.log.LogType;
import com.example.net.BaseRespEntify;

import java.util.logging.Level;

public class UserLoginViewModel extends BaseViewModel<UserLoginRepository> {
    public LoginEntity reqUserEntity = new LoginEntity();
    public UserLoginViewModel(LifecycleOwner _owner) {
        super(_owner);
    }

    @Override
    protected UserLoginRepository createRepository() {
        return new UserLoginRepository();
    }

    @Override
    protected void connectionView() {

    }

    @Override
    protected void disConnectionView() {

    }
    public void loginCmd(LoginEntity entity) {
        mRepository.login(entity).observe(mOwner, new Observer<BaseRespEntify<LoginEntity>>() {
            @Override
            public void onChanged(BaseRespEntify<LoginEntity> result) {
                new CLog.Builder().setLevel(LogLevel.DEBUG)
                        .setLogType(LogType.LOGCAT)
                        .setTag("123")
                        .build().e(result.toString());
            }
        });
    }
}
