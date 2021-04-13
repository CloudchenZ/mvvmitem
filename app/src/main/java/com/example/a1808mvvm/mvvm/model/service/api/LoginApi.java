package com.example.a1808mvvm.mvvm.model.service.api;

import androidx.lifecycle.LiveData;

import com.example.a1808mvvm.mvvm.model.service.entity.FaBuEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.FaSoResultEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.LoginEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.MoreEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsTypeEntity;
import com.example.net.BaseRespEntify;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LoginApi {
    @POST("api/User/login")
    LiveData<BaseRespEntify<LoginEntity>> login(@Body LoginEntity entity);

    @GET("api/NewsType/getAllTypes")
    LiveData<BaseRespEntify<NewsTypeEntity>> getNewsType();
//http://39.98.153.96:8080/Help/Api/GET-api-News-getNews_newstype_pagenum_pagesize
    //@GET("Help/Api/GET-api-News-getNews_newstype_pagenum_pagesize")
    @GET("api/News/getNews")
    LiveData<BaseRespEntify<List<NewsEntity>>> getNewsData(@Query("newstype") int newstype, @Query("pagenum")int pagenum, @Query("pagesize") int pagesize);
    @GET("api/NewsDetail/getNewsDetail")
    LiveData<BaseRespEntify<MoreEntity>> getMoreData(@Query("newscode") String newscode);
    @GET("api/HeadLine/getHeadlineByUserId")
    LiveData<BaseRespEntify<List<HardEntity>>> getHardData(@Query("userid") int userid);
    @POST("api/HeadLine/publishHeadLine")
    LiveData<BaseRespEntify<FaSoResultEntity>>  sendPyq(@Body FaBuEntity faBuEntity);

}
