package com.example.msgbus;

public class EventManager {
    private MsgObservable observable = new MsgObservable();
    private EventManager(){

    }
    private static class A{
        private static EventManager instance = null;
    }
    public static EventManager getInstance(){
        return A.instance;
    }


    public void registerObserver(MsgObserver _observer){
        observable.regsiterObserver(_observer);
    }
}
