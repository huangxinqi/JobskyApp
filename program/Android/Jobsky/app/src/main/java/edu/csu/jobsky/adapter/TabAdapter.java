package edu.csu.jobsky.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import edu.csu.jobsky.fragment.BenbuFragment;
import edu.csu.jobsky.fragment.CareerFragment;
import edu.csu.jobsky.fragment.IndexFragment;
import edu.csu.jobsky.fragment.OnlineFragment;
import edu.csu.jobsky.fragment.TiedaoFragment;
import edu.csu.jobsky.fragment.XiangyaFragment;

/**
 * Created by huangxinqi
 * on 2015/12/12-23:11.
 */
public class TabAdapter extends FragmentPagerAdapter {
    private String[] title=new String[]{"首页","本部招聘","湘雅招聘","铁道招聘","在线招聘","事业招考"};
    private BenbuFragment benbuFragment=new BenbuFragment();
    private XiangyaFragment xiangyaFragment=new XiangyaFragment();
    private OnlineFragment onlineFragment=new OnlineFragment();
    private TiedaoFragment tiedaoFragment=new TiedaoFragment();
    private CareerFragment careerFragment=new CareerFragment();
    private IndexFragment indexFragment=new IndexFragment();
    private Fragment[] fragments =new Fragment[]{indexFragment,benbuFragment,xiangyaFragment,tiedaoFragment,onlineFragment,careerFragment};

    public TabAdapter(FragmentManager fm) {
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

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
