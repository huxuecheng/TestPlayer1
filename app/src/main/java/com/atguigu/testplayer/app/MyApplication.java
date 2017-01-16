package com.atguigu.testplayer.app;

import android.app.Application;

import org.xutils.BuildConfig;
import org.xutils.x;



/**
 * Created by 呼学成 on 16/01/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}

