package edu.csu.service;

import edu.csu.dao.NewsDAO;

import java.util.HashMap;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class NewsService {
    private NewsDAO newsDAO;

    public void setNewsDAO(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    public HashMap<String,Object> getAllNews(){
        return newsDAO.getAllNewsJson();
    }
}
