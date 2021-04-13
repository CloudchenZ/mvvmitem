package com.example.msgbus;

public interface MsgObserver {
    void notify(Object... params);
}
