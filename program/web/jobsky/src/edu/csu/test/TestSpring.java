package edu.csu.test;

import edu.csu.service.AdminService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminService = (AdminService) applicationContext.getBean("adminService");
        adminService.getAdmins();
    }

}
