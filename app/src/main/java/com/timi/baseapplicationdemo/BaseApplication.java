package com.timi.baseapplicationdemo;

import android.app.Application;
import android.content.Context;

/**
 * base  appliacation
 */

public class BaseApplication extends Application {
    public static Application mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }


    /**
     * 获取 application context
     *
     * @return
     */
    public static Context getMApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
