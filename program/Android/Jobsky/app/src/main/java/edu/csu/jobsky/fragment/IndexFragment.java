package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;

import edu.csu.jobsky.R;
import edu.csu.jobsky.widget.SlideShowView;

/**
 * Created by huangxinqi
 * on 2015/12/23-23:34.
 */
public class IndexFragment extends Fragment implements View.OnClickListener {
    private SlideShowView slideShowView;
    private FrameLayout flSection;
    private ScrollView svIndex;
    private HistoryFragment historyFragment;
    private CalendarFragment calendarFragment;
    private RecommendFragment recommendFragment;
    private LatestFragment latestFragment;
    private FragmentManager fragmentManager;

    private ImageButton ivRecommend;
    private ImageButton ivCurrent;
    private ImageButton ivHistory;
    private ImageButton ivCalendar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_index,null);
        svIndex= (ScrollView) view.findViewById(R.id.sv_index);

        fragmentManager=getChildFragmentManager();
        slideShowView= (SlideShowView) view.findViewById(R.id.slide_show_view);
        flSection= (FrameLayout) view.findViewById(R.id.fl_section);

        ivCalendar= (ImageButton) view.findViewById(R.id.iv_calendar);
        ivCurrent= (ImageButton) view.findViewById(R.id.iv_calendar);
        ivRecommend= (ImageButton) view.findViewById(R.id.iv_recommend);
        ivHistory= (ImageButton) view.findViewById(R.id.iv_history);
        ivHistory.setOnClickListener(this);
        ivCalendar.setOnClickListener(this);
        ivCurrent.setOnClickListener(this);
        ivRecommend.setOnClickListener(this);
        setSelectedFragment(0);
        slideShowView.setImageUrls(new String[]{
                "http://jobsky.csu.edu.cn/NewsUploadFiles/131011784218589031%E8%A7%81%E9%9D%A2%E4%BC%9A.jpg"
                ,"http://jobsky.csu.edu.cn/NewsUploadFiles/130953217967640624%E5%B0%B1%E4%B8%9A%E6%94%BF%E7%AD%96.jpg"
                ,"http://jobsky.csu.edu.cn/NewsUploadFiles/130925478538908567微信宣传图2.jpg"
                ,"http://jobsky.csu.edu.cn/NewsUploadFiles/130908662074151820新建文件夹4生源信息_mh1446296386514.jpg"
        });
        slideShowView.initData();
        if(slideShowView.isAutoPlay()){
            slideShowView.startPlay();
        }
        return view;

    }
    private void setSelectedFragment(int fragmentIndex) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (fragmentIndex) {
            case 0:
                if (recommendFragment == null) {
                    recommendFragment = new RecommendFragment();
                    fragmentTransaction.add(R.id.fl_section, recommendFragment);
                } else {
                    fragmentTransaction.show(recommendFragment);
                }
                break;
            case 1:
                if (latestFragment == null) {
                    latestFragment = new LatestFragment();
                    fragmentTransaction.add(R.id.fl_section, latestFragment);
                } else {
                    fragmentTransaction.show(latestFragment);
                }
                break;
            case 2:
                if (calendarFragment == null) {
                    calendarFragment = new CalendarFragment();
                    fragmentTransaction.add(R.id.fl_section, calendarFragment);
                } else {
                    fragmentTransaction.show(calendarFragment);
                }
                break;
            case 3:
                if (historyFragment == null) {
                    historyFragment = new HistoryFragment();
                    fragmentTransaction.add(R.id.fl_section, historyFragment);
                } else {
                    fragmentTransaction.show(historyFragment);
                }
                break;

        }
        fragmentTransaction.commit();
        svIndex.smoothScrollTo(0,0);
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if ( latestFragment!= null) {
            fragmentTransaction.hide(latestFragment);
        }
        if (historyFragment != null) {
            fragmentTransaction.hide(historyFragment);
        }
        if (calendarFragment != null) {
            fragmentTransaction.hide(calendarFragment);
        }
        if (recommendFragment != null) {
            fragmentTransaction.hide(recommendFragment);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_recommend:
                setSelectedFragment(0);
                break;
            case R.id.iv_current:
                setSelectedFragment(1);
                break;
            case R.id.iv_calendar:
                setSelectedFragment(2);
                break;
            case R.id.iv_history:
                setSelectedFragment(3);
                break;
        }
    }
}
