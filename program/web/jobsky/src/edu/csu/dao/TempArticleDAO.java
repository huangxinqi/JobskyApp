package edu.csu.dao;


import edu.csu.bean.TempArticleBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by huangxinqi on 2016/1/17.
 */
public class TempArticleDAO extends BaseDAO{

    public List getAllTempArticle(){
        return QBC(TempArticleBean.class,new HashMap<>());
    }

}
