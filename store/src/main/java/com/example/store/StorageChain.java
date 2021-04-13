package com.example.store;

import com.example.store.callback.ResultCallback;

public abstract class StorageChain<T> {
    protected String chainName;
    protected StorageChain previousChain;
    protected StorageChain nextChain;
    protected abstract void clearDate();
    protected abstract void removeAtKey(String key);
    protected abstract void saveData(String key,T data);
    protected abstract void getData(String key, ResultCallback<T> callback);

    public void setNextChain(StorageChain nextChain){
        this.nextChain = nextChain;
        nextChain.previousChain = this;
    }

    public void  putValues(String key,T data){
        saveData(key, data);
        if (this.nextChain==null){
            this.nextChain.putValues(key,data);
        }
    }
    public void getValue(final String key, final ResultCallback<T> callback){
        getData(key, new ResultCallback<T>() {
            @Override
            public void Success(T data) {
                if (data == null){
                    nextChain.getValue(key,callback);
                }else {
                    if (previousChain!=null){
                        previousChain.putValues(key,data);
                    }
                    callback.Success(data);
                }
            }
        });
    }

    public void removeValue(String key){
        removeAtKey(key);
        if (this.nextChain!=null){
            this.nextChain.removeValue(key);
        }
    }

    public void clear(){
        clearDate();
        if (this.nextChain!= null){
            this.nextChain.clear();
        }
    }
}
