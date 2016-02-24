package edu.csu.jobsky.application;

import android.app.Application;

import org.xutils.BuildConfig;
import org.xutils.x;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by huangxinqi
 * on 2015/12/16-23:02.
 */
public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
        //Xutils
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
        //极光推送初始化
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }


}
