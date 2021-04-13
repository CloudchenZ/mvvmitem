package com.example.net;

import android.text.TextUtils;

import com.example.net.api.TokenApi;
import com.example.net.entity.TokenRespEntity;
import com.example.net.retrofit.LiveDataCallAdpaterFactor;
import com.example.net.untils.ConstValues;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetTools {
    private Retrofit mRetrofit;
    private NetTools(){
        cratrRetrofit();
    }
    private  volatile static NetTools instance = null;
    public static NetTools getInstance(){
        if (null==instance){
            synchronized (NetTools.class){
                if (null==instance){
                    instance = new NetTools();
                }
            }
        }
        return instance;
    }

    private void cratrRetrofit(){
        mRetrofit = new Retrofit.Builder()
                .client(createClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdpaterFactor.create())
                .baseUrl(BuildConfig.SERVER_URL)
                .build();
    }

    private OkHttpClient createClient() {
        return new OkHttpClient.Builder()
                .writeTimeout(ConstValues.TIMEOUT_VALUE, TimeUnit.MINUTES)
                .readTimeout(ConstValues.TIMEOUT_VALUE, TimeUnit.MINUTES)
                .connectTimeout(ConstValues.TIMEOUT_VALUE, TimeUnit.MINUTES)
                .addInterceptor(crateTokenInterceptor())
                .addNetworkInterceptor(createNetworkInterceptor())
                .build();
    }

    private Interceptor crateTokenInterceptor() {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Response response = chain.proceed(request);
                if (checkHttpCode401(response)){
                    String token=requestToken();
                    if (TextUtils.isEmpty(token)){
                        //ZLog.e("Error : token is null...");
                        throw new RuntimeException("Token is null...");
                    }
                    //Request newRequest=chain.request();
                    Request.Builder newBuilder = request.newBuilder().addHeader("Authorization", "bearer " + token);

                    Request newRequest=newBuilder.build();
                    return chain.proceed(newRequest);
                }
                return response;
            }
        };
        return interceptor;
    }

    private boolean checkHttpCode401(Response response) {
        if (null==response){
            return false;
        }

        if (response.code()==401){
            return true;
        }
        else{
            return false;
        }
    }

    private String requestToken() {

        TokenApi tokenApi = create(TokenApi.class);
        Call<TokenRespEntity> tokenService = tokenApi.getToken("password", ConstValues.AUTHCODE, "");
        try {
            retrofit2.Response<TokenRespEntity> result = tokenService.execute();
            if (result!=null&&result.body()!=null){
                return  result.body().getAccess_token();
            }
        } catch (IOException e) {
            //ZLog.e(e.getMessage());
        }
        return "";
    }
    private Interceptor createNetworkInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    public <T> T create(Class<?> clazz){
        return (T) mRetrofit.create(clazz);
    }
}
