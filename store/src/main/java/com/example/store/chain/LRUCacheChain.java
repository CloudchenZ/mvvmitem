package com.example.store.chain;

import com.example.store.StorageChain;
import com.example.store.callback.ResultCallback;
import com.example.store.untils.LRUCacheUtils;

public class LRUCacheChain<T> extends StorageChain<T> {
    @Override
    protected void clearDate() {
        LRUCacheUtils.getInstance().clear();
    }

    @Override
    protected void removeAtKey(String key) {
        LRUCacheUtils.getInstance().removeValue(key);
    }

    @Override
    protected void saveData(String key, T data) {
        LRUCacheUtils.getInstance().putValue(key, data);
    }

    @Override
    protected void getData(String key, ResultCallback<T> callback) {
        if (callback==null){
            throw new IllegalArgumentException("callback paraster is null");
        }
        callback.Success((T) LRUCacheUtils.getInstance().geValue(key));
    }
}
