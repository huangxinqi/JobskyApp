package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Date;
import java.util.List;

import edu.csu.jobsky.R;
import edu.csu.jobsky.adapter.ArticleToShowAdapter;
import edu.csu.jobsky.bean.ArticleToShowBean;
import edu.csu.jobsky.util.DateUtil;
import edu.csu.jobsky.util.ListViewUtil;
import edu.csu.jobsky.widget.MyListView;

/**
 * Created by huangxinqi
 * on 2015/12/12-23:17.
 */
public class RecommendFragment extends BaseFragment{
    private MyListView listview;
    private ArticleToShowAdapter adapter;
    private List<ArticleToShowBean.ArticlesEntity> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_recommand,null);
        listview= (MyListView) view.findViewById(R.id.lv_article);
        RequestParams params=new RequestParams("http://jobsky.csu.edu.cn:8001/app/getArticleListFromTime.action");
        params.addQueryStringParameter("time", DateUtil.date2String(new Date()));
        params.addQueryStringParameter("page",page+"");
        params.addQueryStringParameter("pageNum",pageNum+"");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                if (s!=null){
                    ArticleToShowBean articleToShowBean=new Gson().fromJson(s,ArticleToShowBean.class);
                    if (articleToShowBean.getStatus().equals("1")&&articleToShowBean.getArticles().size()>0){
                        list=articleToShowBean.getArticles();
                        adapter=new ArticleToShowAdapter(getActivity(),list);
                        listview.setAdapter(adapter);
                        ListViewUtil.setListViewHeightBasedOnChildren(listview);
                        ArticleToShowAdapter articleToShowAdapter=new ArticleToShowAdapter(getActivity(),list);
                        listview.setAdapter(articleToShowAdapter);
                        ListViewUtil.setListViewHeightBasedOnChildren(listview);
                    }
                    else{
                        Toast.makeText(getActivity(),"抱歉,暂无招聘信息",Toast.LENGTH_SHORT).show();
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

        return view;
    }
}
