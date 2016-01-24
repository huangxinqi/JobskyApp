package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.csu.jobsky.R;
import edu.csu.jobsky.widget.SlideShowView;

/**
 * Created by huangxinqi
 * on 2015/12/23-23:34.
 */
public class IndexFragment extends Fragment {
    private SlideShowView slideShowView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_index,null);
        slideShowView= (SlideShowView) view.findViewById(R.id.slide_show_view);
        slideShowView.setImageUrls(new String[]{
                "http://jobsky.csu.edu.cn/NewsUploadFiles/130952180224845132讲座新闻图片.jpg"
                ,"http://jobsky.csu.edu.cn/NewsUploadFiles/130925478538908567微信宣传图2.jpg"
                ,"http://jobsky.csu.edu.cn/NewsUploadFiles/130908662074151820新建文件夹4生源信息_mh1446296386514.jpg"
        });
        slideShowView.initData();
        if(slideShowView.isAutoPlay()){
            slideShowView.startPlay();
        }
        return view;
    }

}
