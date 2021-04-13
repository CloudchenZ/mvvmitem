package com.example.log.impl;

import android.util.Log;

import com.example.log.BuildConfig;
import com.example.log.CymLog;
import com.example.log.LogLevel;

public class LogCatLog implements CymLog {
    private String CYMTAG = "YuMings";
    private int logLevel = LogLevel.DEBUG;
    @Override
    public void d(String log) {
        if (BuildConfig.isDebug&&LogLevel.DEBUG>=logLevel){
            Log.d(getTAG(), log);
        }
    }

    @Override
    public void i(String log) {
        if (BuildConfig.isDebug&&LogLevel.INFO>=logLevel){
            Log.i(getTAG(), log);
        }
    }

    @Override
    public void w(String log) {
        if (BuildConfig.isDebug&&LogLevel.WARNNING>=logLevel) {
            Log.w(getTAG(), log);
        }
    }

    @Override
    public void e(String log) {
        if (BuildConfig.isDebug&&LogLevel.ERROR>=logLevel){
            Log.e(getTAG(), log);
        }
    }

    @Override
    public void setLogLevel(int level) {
        logLevel = level;
    }

    public void LogLevel(int _Loglevel){
        logLevel = _Loglevel;
    }

    public void setTag(String tag){
        CYMTAG = tag;
    }

    private String getTAG(){
        return CYMTAG;
    }
}
