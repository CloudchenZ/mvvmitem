package com.example.store.untils;

import android.util.LruCache;

public class LRUCacheUtils<V> {
    int maxSize = (int) (Runtime.getRuntime().totalMemory()/8);
    private LRUCacheUtils(){
        lruCache = new LruCache<>(maxSize);
    }
    private static volatile LRUCacheUtils instance = null;
    public static LRUCacheUtils getInstance(){
        if (null == instance){
            synchronized (LRUCacheUtils.class){
                instance = new LRUCacheUtils();
            }
        }
        return instance;
    }
   LruCache<String,V> lruCache = null;

    public void putValue(String key,V value){
        lruCache.put(key,value);
    }
    public V geValue(String key){
       return lruCache.get(key);
    }

    public void removeValue(String key){
        lruCache.remove(key);
    }

    public void clear(){
        lruCache.evictAll();
    }


}
