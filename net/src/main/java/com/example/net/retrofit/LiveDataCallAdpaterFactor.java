package com.example.net.retrofit;

import androidx.lifecycle.LiveData;

import com.example.net.BaseRespEntify;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

public class LiveDataCallAdpaterFactor extends CallAdapter.Factory {
    public static LiveDataCallAdpaterFactor create(){
        return new LiveDataCallAdpaterFactor();
    }

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Class<?> rawType = getRawType(returnType);
        if (rawType != LiveData.class){
           // throw new IllegalStateException("not liveData Type");
            return null;
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) returnType);
        Class<?> rawObservableType = getRawType(parameterUpperBound);
        if (rawObservableType != BaseRespEntify.class){
            throw new IllegalArgumentException("paramater type is wrong");
        }

        return new LiveDataCallAdapter<>(rawObservableType);
    }
}
