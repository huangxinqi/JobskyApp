package edu.csu.service;

import edu.csu.dao.ArticleDAO;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class ArticleService {
    private ArticleDAO articleDAO;
    public void setArticleDAO(ArticleDAO articleDAO){
        this.articleDAO=articleDAO;
    }
    public String fuck(){
        return articleDAO.fuck();
    }
}
