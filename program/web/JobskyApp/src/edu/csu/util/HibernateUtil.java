package edu.csu.util;

import edu.csu.bean.AdminBean;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by huangxinqi on 2015/1/15 9:46.
 * Good Good Study
 * Day Day UP
 * ⁄(⁄ ⁄•⁄ω⁄•⁄ ⁄)⁄)
 */
public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
            ourSessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException{
        return ourSessionFactory.openSession();
    }

    public static void main(String[] args) {
        AdminBean adminEntity=getSession().get(AdminBean.class,1);
        System.out.println(adminEntity.getAdminName());
    }
}
