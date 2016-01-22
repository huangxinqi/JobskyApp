package edu.csu.jobsky.activity;

import android.content.Intent;
import android.os.Bundle;

import edu.csu.jobsky.R;
import edu.csu.jobsky.util.SharedPreferencesUtil;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Object isFirstSetup=SharedPreferencesUtil.get(WelcomeActivity.this,"is_first_setup",true);
        if ((boolean)isFirstSetup){
            startActivity(new Intent().setClass(WelcomeActivity.this,GuideActivity.class));
        }
        else{
            startActivity(new Intent().setClass(WelcomeActivity.this,MainActivity.class));
        }
        finish();
    }
}
