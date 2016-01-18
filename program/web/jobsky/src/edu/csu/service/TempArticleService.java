package edu.csu.service;

import edu.csu.bean.TempArticleBean;
import edu.csu.dao.TempArticleDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class TempArticleService {
    private TempArticleDAO tempArticleDAO;

    public void setArticleDAO(TempArticleDAO tempArticleDAO) {
        this.tempArticleDAO = tempArticleDAO;
    }
    public List<TempArticleBean> getAllTempArticle(){
        return tempArticleDAO.getAllTempArticle();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        TempArticleService tempArticleService= (TempArticleService) applicationContext.getBean("tempArticleService",TempArticleService.class);
        System.out.println(tempArticleService.getAllTempArticle().size());
    }
}
