package edu.csu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by huangxinqi on 2016/1/16.
 */
public class SqlServerUtil {
    private static String driverString = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String connectionString = "jdbc:sqlserver://127.0.0.1:1433;databaseName=jobskynet8";
    private static String username = "sa";
    private static String password = "sa";
    public static Connection getConnection() throws Exception {
        Connection connection = null;
        try {
            Class.forName(driverString);
            connection = DriverManager.getConnection(connectionString,username,password);
        } catch (Exception e) {
            throw e;
        }
        return connection;
    }


    public static void main(String[] args) throws Exception {
        Connection conn = SqlServerUtil.getConnection();
        System.out.println(conn);
        String sql="select title from article";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }


    // TODO: 还没有写关闭Connection的方法呢
}
