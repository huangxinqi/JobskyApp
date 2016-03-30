package edu.csu.jobsky.activity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.File;

import edu.csu.jobsky.R;
import edu.csu.jobsky.adapter.NavigationItemAdapter;
import edu.csu.jobsky.bean.WeatherBean;
import edu.csu.jobsky.fragment.HomeFragment;
import edu.csu.jobsky.fragment.PostFragment;
import edu.csu.jobsky.fragment.UserFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private HomeFragment homeFragment;
    private PostFragment postFragment;
    private UserFragment userFragment;
    private Toolbar toolbar;
    private ListView lvNavigation;

    private ImageView ivPost;
    private ImageView ivUser;
    private ImageView ivEmploy;

    private FragmentManager fragmentManager;
    private int fragmentIndex;

    private TextView tvDegree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializedView();
        setSelectedFragment(0);
    }
    private void initializedView(){
        fragmentManager=getSupportFragmentManager();

        ivEmploy= (ImageView) findViewById(R.id.iv_employ);
        ivPost= (ImageView) findViewById(R.id.iv_post);
        ivUser= (ImageView) findViewById(R.id.iv_user);
        ivUser.setOnClickListener(this);
        ivPost.setOnClickListener(this);
        ivEmploy.setOnClickListener(this);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        lvNavigation= (ListView) findViewById(R.id.lv_navigation);

        //drawer.closeDrawer(GravityCompat.START);  关闭navigtion 的代码

        LayoutInflater inflater=LayoutInflater.from(this);
        lvNavigation.addHeaderView(inflater.inflate(R.layout.nav_header_main,lvNavigation,false));
        //lvNavigation.addFooterView(inflater.inflate(R.layout.item_nav_footer,lvNavigation,false));
        lvNavigation.setAdapter(new NavigationItemAdapter(MainActivity.this));

        tvDegree= (TextView) findViewById(R.id.tv_degree);
        setTemperature();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setSelectedFragment(int fragmentIndex) {
        this.fragmentIndex = fragmentIndex;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        reset();
        switch (fragmentIndex) {
            case 0:
                ivEmploy.setImageResource(R.drawable.icon_employ_selected);
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fl_fragment, homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case 1:
                ivUser.setImageResource(R.drawable.icon_person_selected);
                if (userFragment == null) {
                    userFragment=new UserFragment();
                    fragmentTransaction.add(R.id.fl_fragment, userFragment);
                } else {
                    fragmentTransaction.show(userFragment);
                }
                break;
            case 2:
                ivPost.setImageResource(R.drawable.icon_post_selected);
                if (postFragment==null){
                    postFragment=new PostFragment();
                    fragmentTransaction.add(R.id.fl_fragment,postFragment);
                }
                else{
                    fragmentTransaction.show(postFragment);
                }
        }
        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if ( homeFragment!= null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (userFragment != null) {
            fragmentTransaction.hide(userFragment);
        }
        if (postFragment!=null){
            fragmentTransaction.hide(postFragment);
        }
    }

    private void reset(){
        ivEmploy.setImageResource(R.drawable.icon_employ);
        ivUser.setImageResource(R.drawable.icon_person);
        ivPost.setImageResource(R.drawable.icon_post);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_employ:
                setSelectedFragment(0);
                break;
            case R.id.iv_user:
                setSelectedFragment(1);
                break;
            case R.id.iv_post:
                setSelectedFragment(2);
        }
    }

     private void setTemperature(){
        RequestParams params=new RequestParams("http://apicloud.mob.com/v1/weather/query");
        params.addQueryStringParameter("city","长沙");
        params.addQueryStringParameter("province","湖南");
        params.addQueryStringParameter("key","f922b4f31ebd");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                if (s!=null){
                    WeatherBean weatherBean=new Gson().fromJson(s,WeatherBean.class);
                    if (weatherBean.getRetCode().equals("200")){
                        tvDegree.setText(weatherBean.getResult().get(0).getTemperature());
                    }
                }
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
     }

    /**
     * 检查版本
     */
    private void getLatestVersion(){
        RequestParams params=new RequestParams();
        x.http().get(params,new Callback.CommonCallback<Object>(){

            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void downloadApk(){
        RequestParams requestParams=new RequestParams();

        x.http().get(requestParams, new Callback.CommonCallback<File>() {
            @Override
            public void onSuccess(File file) {

            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

}
