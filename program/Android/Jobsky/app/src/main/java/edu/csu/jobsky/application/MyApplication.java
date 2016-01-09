package edu.csu.jobsky.application;

import android.app.Application;
import android.content.Context;



import cn.jpush.android.api.JPushInterface;
import org.xutils.x;
/**
 * Created by huangxinqi
 * on 2015/12/16-23:02.
 */
public class MyApplication extends Application {
    //云旺OpenIM的DEMO用到的Application上下文实例
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //极光推送初始化
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

        //Xutils3 初始化
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志

    }
}
