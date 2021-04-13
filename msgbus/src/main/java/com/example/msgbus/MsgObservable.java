package com.example.msgbus;

import android.app.ActivityManager;

import com.example.log.CLog;
import com.example.log.CLogManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MsgObservable{
    private volatile List<MsgObserver> observerList =new ArrayList<>();


    public synchronized void regsiterObserver(MsgObserver _observer){
        if (observerList.contains(_observer)){
            CLogManager.getInstance().e("this observer");
            return;
        }
        observerList.add(_observer);

    }

    public synchronized void unRegisterObserver(MsgObserver _observer){
        if (observerList.contains(_observer)){
            this.observerList.remove(_observer);
            return;
        }
        CLogManager.getInstance().e("this observer is not exists");
    }

    public synchronized void notifyAllObservers(Object... params){
        for (MsgObserver observer :
             observerList) {
            observer.notify(params);
        }
    }
}
