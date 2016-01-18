package edu.csu.dao;

import edu.csu.bean.AdminBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huangxinqi on 2016/1/17.
 */
public class AdminDAO extends BaseDAO {
    public List getAdmins() {
        Map map = new HashMap<String, Object>();
        return QBC(AdminBean.class, map);
    }

}
