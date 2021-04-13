package com.example.log;

import com.example.log.impl.ConsoleLog;
import com.example.log.impl.LogCatLog;
import com.example.log.impl.NetLog;

public class CLog {
    private CymLog cymLog = null;

    private LogType mLogTYpe;
    private int mLogLevel;
    private String mTag;

    private CLog(LogType _logType,int _logLevel,String _tag){
        this.mLogTYpe=_logType;
        this.mLogLevel=_logLevel;
        this.mTag=_tag;

        setLogType(this.mLogTYpe);
        setLogLevel(this.mLogLevel);
        setTag(this.mTag);
    }
    public void setLogType(LogType _type){
        switch (_type){
            case LOGCAT:
                cymLog = new LogCatLog();
                break;
            case NET:
                cymLog = new NetLog();
                break;
            case OTHER:
                break;
            case CONSOLE:
                cymLog = new ConsoleLog();
                break;
        }
    }
    private void setTag(String _tag){
        cymLog.setTag(_tag);
    }

    private void setLogLevel(int _logLevel){
        cymLog.setLogLevel(_logLevel);
    }
    public void i(String log){
        cymLog.i(log);
    }
    public void w(String log){
        cymLog.w(log);
    }
    public void e(String log){
        cymLog.e(log);
    }
    public void d(String log){
        cymLog.d(log);
    }
    public static final class Builder{
        private LogType mType;
        private int mLevel;
        private String mTag;

        public Builder setLogType(LogType _type){
            mType=_type;
            return this;
        }

        public Builder setLevel(int _level){
            mLevel=_level;
            return this;
        }

        public Builder setTag(String _tag){
            mTag=_tag;
            return this;
        }

        public CLog build(){
            return new CLog(mType,mLevel,mTag);
        }
    }
}
