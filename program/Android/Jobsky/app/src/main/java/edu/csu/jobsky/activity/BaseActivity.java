package edu.csu.jobsky.activity;

import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by huangxinqi
 * on 2015/12/23-17:20.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }
}
