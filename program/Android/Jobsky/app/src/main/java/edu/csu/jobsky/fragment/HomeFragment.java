package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.csu.jobsky.R;
import edu.csu.jobsky.adapter.IndexAdapter;
import edu.csu.jobsky.adapter.TabAdapter;
import edu.csu.jobsky.adapter.ViewPageFragmentAdapter;
import edu.csu.jobsky.util.OnTabReselectListener;
import edu.csu.jobsky.widget.DepthPageTransformer;
import edu.csu.jobsky.widget.PagerSlidingTabStrip;

public class HomeFragment extends Fragment{
    private ViewPager vpTab;
    private TabAdapter tabAdapter;
    private TabLayout tlTab;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,null);
        initializeView(view);
        return view;
    }

    private void initializeView(View view) {
        vpTab= (ViewPager) view.findViewById(R.id.vp_tab);
        tlTab= (TabLayout) view.findViewById(R.id.tl_tab);
        tabAdapter=new TabAdapter(getChildFragmentManager());
        vpTab.setAdapter(tabAdapter);
        vpTab.setPageTransformer(true, new DepthPageTransformer());
        tlTab.setupWithViewPager(vpTab);

    }


}
