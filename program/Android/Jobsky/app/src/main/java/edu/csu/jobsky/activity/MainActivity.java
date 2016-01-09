package edu.csu.jobsky.activity;

import android.annotation.TargetApi;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import edu.csu.jobsky.R;
import edu.csu.jobsky.adapter.TabAdapter;
import edu.csu.jobsky.fragment.CalendarFragment;
import edu.csu.jobsky.fragment.ChatFragment;
import edu.csu.jobsky.fragment.HomeFragment;
import edu.csu.jobsky.widget.DepthPageTransformer;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {
    private HomeFragment homeFragment;
    private CalendarFragment calendarFragment;
    private ChatFragment chatFragment;

    private RelativeLayout rlHome;
    private RelativeLayout rlCalendar;
    private RelativeLayout rlCHat;

    private ImageView ivHome;
    private ImageView ivChat;
    private ImageView ivCalendar;

    private TextView tvHome;
    private TextView tvCalendar;
    private TextView tvChat;

    private FragmentManager fragmentManager;
    private int fragmentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializedView();
        setSelectedFragment(0);
    }
    private void initializedView(){
        fragmentManager=getSupportFragmentManager();

        rlCalendar= (RelativeLayout) findViewById(R.id.rl_tab_calendar);
        rlCHat= (RelativeLayout) findViewById(R.id.rl_tab_chat);
        rlHome= (RelativeLayout) findViewById(R.id.rl_tab_home);

        rlCalendar.setOnClickListener(this);
        rlCHat.setOnClickListener(this);
        rlHome.setOnClickListener(this);

        ivCalendar= (ImageView) findViewById(R.id.iv_calendar);
        ivChat= (ImageView) findViewById(R.id.iv_chat);
        ivHome= (ImageView) findViewById(R.id.iv_home);

        tvCalendar= (TextView) findViewById(R.id.tv_calendar);
        tvChat= (TextView) findViewById(R.id.tv_chat);
        tvHome= (TextView) findViewById(R.id.tv_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setSelectedFragment(int fragmentIndex) {
        this.fragmentIndex = fragmentIndex;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (fragmentIndex) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fl_fragment, homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case 1:
                if (chatFragment == null) {
                    chatFragment=new ChatFragment();
                    fragmentTransaction.add(R.id.fl_fragment, chatFragment);
                } else {
                    fragmentTransaction.show(chatFragment);
                }
                break;
            case 2:
                if (calendarFragment == null) {
                    calendarFragment = new CalendarFragment();
                    fragmentTransaction.add(R.id.fl_fragment, calendarFragment);
                } else {
                    fragmentTransaction.show(calendarFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if ( homeFragment!= null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (chatFragment != null) {
            fragmentTransaction.hide(chatFragment);
        }
        if (calendarFragment != null) {
            fragmentTransaction.hide(calendarFragment);
        }
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

    @Override
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
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_tab_home:
                setSelectedFragment(0);
                break;
            case R.id.rl_tab_chat:
                setSelectedFragment(1);
                break;
            case R.id.rl_tab_calendar:
                setSelectedFragment(2);
                break;
        }
    }
}
