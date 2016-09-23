package com.myutils.l;

import android.app.Application;

/**
 * Created by OAIM on 2016/9/23.
 */
public class AppContext extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        L.setIsLog(true);
        L.setLogtag("logtag");
    }
}
