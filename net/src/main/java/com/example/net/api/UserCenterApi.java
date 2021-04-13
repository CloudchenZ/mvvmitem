package com.example.net.api;

import androidx.lifecycle.LiveData;

import com.example.net.BaseRespEntify;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserCenterApi {
    @POST("/login")
    @FormUrlEncoded
    LiveData<BaseRespEntify<Object>> login(@Field("username") String username, @Field("pwd") String pwd);

}
