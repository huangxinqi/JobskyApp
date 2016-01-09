package edu.csu.jobsky.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import edu.csu.jobsky.fragment.CalendarFragment;
import edu.csu.jobsky.fragment.ChatFragment;
import edu.csu.jobsky.fragment.HomeFragment;

/**
 * Created by huangxinqi
 * on 2015/12/24-19:20.
 */
public class IndexAdapter extends FragmentPagerAdapter {
    private HomeFragment homeFragment=new HomeFragment();
    private ChatFragment chatFragment=new ChatFragment();
    private CalendarFragment calendarFragment=new CalendarFragment();
    private Fragment[] fragments=new Fragment[]{homeFragment,calendarFragment,chatFragment};

    public IndexAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
