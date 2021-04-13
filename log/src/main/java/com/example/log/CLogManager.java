package com.example.log;

public class CLogManager {
    private static CLogManager instance=new CLogManager();
    private CLogManager(){}
    public static CLogManager getInstance(){
        return instance;
    }

    private CLog clog;
    public void init(CLog _log){
        if (_log==null){
            clog=new CLog.Builder().setLogType(LogType.LOGCAT)
                    .setLevel(LogLevel.DEBUG)
                    .setTag("bawei1808").build();
        }
        else{
            clog=_log;
        }
    }

    public void d(String log){
        clog.d(log);
    }

    public void i(String log){
        clog.i(log);
    }

    public void w(String log){
        clog.w(log);
    }

    public void e(String log){
        clog.e(log);
    }
}
