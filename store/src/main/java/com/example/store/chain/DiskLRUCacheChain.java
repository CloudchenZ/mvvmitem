package com.example.store.chain;

import com.example.store.StorageChain;
import com.example.store.callback.ResultCallback;
import com.example.store.untils.DiskLRUCacheUtils;

public class DiskLRUCacheChain<T> extends StorageChain<T> {
    @Override
    protected void clearDate() {
        DiskLRUCacheUtils.getInstance().clear();
    }

    @Override
    protected void removeAtKey(String key) {
        DiskLRUCacheUtils.getInstance().removeValue(key);
    }

    @Override
    protected void saveData(String key, T data) {
        DiskLRUCacheUtils.getInstance().putValue(key,data);
    }

    @Override
    protected void getData(String key, ResultCallback<T> callback) {
        if (callback==null){
            throw new IllegalArgumentException("callback is null");
        }
        callback.Success((T) DiskLRUCacheUtils.getInstance().getValue(key));
    }
}
