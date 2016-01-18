package edu.csu.dao;

import edu.csu.bean.NewsBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class NewsDAO extends BaseDAO {
    public List getAllNews(){
        return QBC(NewsBean.class,new HashMap<>());
    }

    public HashMap<String,Object> getAllNewsJson(){
        HashMap<String,Object> map=new HashMap<String,Object>();
        ArrayList<NewsBean> list=new ArrayList<NewsBean>();
        list= (ArrayList<NewsBean>) getAllNews();
        for (NewsBean newsBean:list){
            map.put("newsId",newsBean.getNewsId());
            map.put("title",newsBean.getTitle());
            map.put("clickTimes",newsBean.getClickTimes());
        }
        return map;
    }


}
