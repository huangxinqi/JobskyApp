package edu.csu.service;

import edu.csu.bean.AdminBean;
import edu.csu.dao.AdminDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class AdminService {
    private AdminDAO adminDAO;

    public void setAdminDAO(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    public void getAdmins(){
        for (AdminBean adminBean:(ArrayList<AdminBean>)adminDAO.getAdmins()){
            System.out.println(adminBean.getAdminId());
            System.out.println(adminBean.getAdminName());
            System.out.println(adminBean.getAdminAccount());
            System.out.println(adminBean.getAdminPwd());
        }

    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext);
        AdminService adminService= (AdminService) applicationContext.getBean("adminService");
        adminService.getAdmins();
    }
}
