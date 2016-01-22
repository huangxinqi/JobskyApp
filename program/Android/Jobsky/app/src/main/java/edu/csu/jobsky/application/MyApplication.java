package edu.csu.jobsky.application;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by huangxinqi
 * on 2015/12/16-23:02.
 */
public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
        //极光推送初始化
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }


}
