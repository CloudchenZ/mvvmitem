package com.example.net.retrofit;

import android.os.Looper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.net.BaseRespEntify;

import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveDataCallAdapter<R> implements CallAdapter<R, LiveData<BaseRespEntify<R>>> {
    private Type type;
    public LiveDataCallAdapter(Type _type){
        type = _type;
    }
    @Override
    public Type responseType() {
        return type;
    }

    @Override
    public LiveData<BaseRespEntify<R>> adapt(Call<R> call) {
        final MutableLiveData<BaseRespEntify<R>> data = new MutableLiveData<>();
        call.enqueue(new Callback<R>() {
            @Override
            public void onResponse(Call<R> call, Response<R> response) {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()){
                    data.setValue((BaseRespEntify<R>) response.body());
                }else {
                    data.postValue((BaseRespEntify<R>) response.body());
                }

            }

            @Override
            public void onFailure(Call<R> call, Throwable t) {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()){
                    data.setValue(null);
                }else {
                    data.postValue(null);
                }
            }
        });
        return data;
    }
}
