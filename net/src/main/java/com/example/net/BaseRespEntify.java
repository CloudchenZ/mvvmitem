package com.example.net;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

public class BaseRespEntify<T> {
    private int code;
    private T data;
    private String msg;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public T getData(Class<?> _type){
        if (data instanceof java.util.List){
            List<Object> targetList = new ArrayList<>();
            List<Object> tempList = (List<Object>) data;
            for (Object t:
                 tempList) {
                if (t instanceof LinkedTreeMap){
                    String newJsonStr = GsonUtlis.getInstance().getGson().toJson(t);
                    Object newInstance = GsonUtlis.getInstance().getGson().fromJson(newJsonStr,_type);
                    targetList.add(newInstance);
                }
            }
            data = (T) targetList;
        }else{

                String newJsonStr = GsonUtlis.getInstance().getGson().toJson(data);
                Object newInstance = GsonUtlis.getInstance().getGson().fromJson(newJsonStr,_type);
                data = (T) newInstance;

        }
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
