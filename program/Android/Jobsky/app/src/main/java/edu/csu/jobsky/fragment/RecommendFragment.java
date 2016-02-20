package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import edu.csu.jobsky.R;
import edu.csu.jobsky.adapter.ArticleToShowAdapter;
import edu.csu.jobsky.util.ListViewUtil;
import edu.csu.jobsky.widget.MyListView;

/**
 * Created by huangxinqi
 * on 2015/12/12-23:17.
 */
public class RecommendFragment extends Fragment{
    private MyListView listview;
    private ArticleToShowAdapter adapter;
    private List<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_recommand,null);
        listview= (MyListView) view.findViewById(R.id.lv_article);
        list=new ArrayList<String>();
        int i=0;
        while(i<10){
            list.add(""+i);
            i++;
        }
        ArticleToShowAdapter articleToShowAdapter=new ArticleToShowAdapter(getActivity(),list);
        listview.setAdapter(articleToShowAdapter);
        ListViewUtil.setListViewHeightBasedOnChildren(listview);
        return view;
    }
}
