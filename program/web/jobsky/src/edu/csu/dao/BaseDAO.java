package edu.csu.dao;

import edu.csu.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class BaseDAO {
    protected void add(Object object){
        Session session= HibernateUtil.getSession();
        Transaction transaction=null;
        try {
            transaction=session.beginTransaction();
            session.save(object);
            transaction.commit();
        }
        catch (Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
    protected void update(Object object){
        Session session=HibernateUtil.getSession();
        Transaction transaction=null;
        try {
            transaction=session.beginTransaction();
            if (object!=null){
                session.update(object);
                transaction.commit();
            }
        }catch (Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }

    protected void delete(Object object,Class cla,int id){
        Session session=HibernateUtil.getSession();
        Transaction transaction=null;
        try {
            transaction=session.beginTransaction();
            if (id==0&&object!=null){
                session.delete(object);
            }
            else {
                Object o=session.get(cla,id);
                session.delete(o);
            }
            transaction.commit();
        }
        catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }



    protected List<Object> query(Class cla, Map<String,Object> map){
        Session session=HibernateUtil.getSession();
        List<Object> list=null;
        Transaction transaction =null;
        String hql="from "+cla.getSimpleName();

        if (map!=null){
            Iterator<Map.Entry<String,Object>> iterator=map.entrySet().iterator();
            for(int i=0;i<map.size();i++){
                Map.Entry<String,Object> entry=iterator.next();
                while (i<1){
                    hql+=" where "+entry.getKey()+" =?";
                }
                while(i>=1){
                    hql+=" and "+entry.getKey()+" =? ";
                }
            }
        }
        Query query=session.createQuery(hql);

        return list;
    }
    protected List<Object> QBC(Class cla,Map<String,Object> map){
        Session session= HibernateUtil.getSession();
        List<Object> list=null;
        Criteria criteria=session.createCriteria(cla);
        if (map!=null&&map.size()!=0){
            for(Map.Entry<String,Object> entry:map.entrySet()){
                criteria.add(Restrictions.eq(entry.getKey(),entry.getValue()));
            }
        }
        list=criteria.list();
        return list;
    }
}
