package edu.csu.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import edu.csu.service.NewsService;
import edu.csu.util.JsonFormat;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class NewsAction extends ActionSupport {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    /*public String getAllNews(){
        NewsService newsService= (NewsService) applicationContext.getBean("newsService");
        try {
            JsonFormat.toJson(ServletActionContext.getResponse(), newsService.getAllNews());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public String download() {
        return SUCCESS;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        NewsService newsService = (NewsService) applicationContext.getBean("newsService");
        System.out.println(new Gson().toJson(newsService.getAllNews()));
    }

}
