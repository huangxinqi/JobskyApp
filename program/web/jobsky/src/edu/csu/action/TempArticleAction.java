package edu.csu.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.csu.bean.TempArticleBean;
import edu.csu.dao.TempArticleDAO;
import edu.csu.service.TempArticleService;
import edu.csu.util.JsonFormat;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class TempArticleAction extends ActionSupport {
    public String getAllTempArticle(){
        Map<String,Object> map=new HashMap<String,Object>();
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        TempArticleService tempArticleService= (TempArticleService) applicationContext.getBean("tempArticleService",TempArticleService.class);
        ArrayList<TempArticleBean> list= (ArrayList<TempArticleBean>) tempArticleService.getAllTempArticle();
        if (list.size()>0){
            map.put("status",1);
            map.put("info","成功");
            map.put("tempArticle",list);
        }
        try {
            JsonFormat.toJson(ServletActionContext.getResponse(),map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
