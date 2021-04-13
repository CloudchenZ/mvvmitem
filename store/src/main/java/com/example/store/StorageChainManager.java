package com.example.store;

import android.app.DownloadManager;

import com.example.store.callback.ResultCallback;
import com.example.store.chain.DiskLRUCacheChain;
import com.example.store.chain.LRUCacheChain;

import java.util.concurrent.ConcurrentHashMap;

public class StorageChainManager<T> {
    private static volatile StorageChainManager instance = null;
    private StorageChainManager(){
        chainMap = new ConcurrentHashMap<>();

    }
    public static StorageChainManager getInstance(){
        if (null == instance){
            synchronized (StorageChainManager.class){
                if (null == instance){
                    instance = new StorageChainManager();
                }
            }
        }
        return instance;
    }
    private DiskLRUCacheChain diskLRUCacheChain = null;

    private LRUCacheChain memoryCacheChain = null;
    private static ConcurrentHashMap<String,StorageChain> chainMap;

    public void putValue(String key,T value){
        if (!chainMap.containsKey(key)){
            initChain(key);
        }
        memoryCacheChain.putValues(key,value);
    }

    private StorageChain initChain(String key) {
        memoryCacheChain = new LRUCacheChain();
        diskLRUCacheChain = new DiskLRUCacheChain();

        memoryCacheChain.setNextChain(diskLRUCacheChain);

        chainMap.put(key,memoryCacheChain);
        return diskLRUCacheChain;
    }

    public void getValue(String key, ResultCallback callback){
        if (chainMap.containsKey(key)){
            chainMap.get(key).getValue(key, callback);
        }
    }

    public void addChain(String key,StorageChain storageChain){
        if (chainMap.containsKey(key)){
            StorageChain storageChain1 = chainMap.get(key);
            while (storageChain1!=null){
                storageChain1 = storageChain.nextChain;
            }

            storageChain1.setNextChain(storageChain);
        }else {
            initChain(key);
        }
    }
}
