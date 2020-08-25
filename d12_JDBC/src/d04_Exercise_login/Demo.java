package d04_Exercise_login;
/*
 * 【练习】：登录账户，输入密码
 * */

import util.JDBC_Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("用户名：");
        String name = sc.nextLine();
        System.out.print("密码：");
        String password = sc.nextLine();

        boolean b = new Demo().login(name, password);
        if (b){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败");
        }
    }

    public boolean login(String name, String password) {
        if (name == null || password == null) {//用户名密码为空，直接返回false
            return false;
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from jdbc_user where name='"+name+"' and password='"+password+"'";
            //即""+name+""
            connection = JDBC_Utils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            return resultSet.next();//若有下一行，返回true
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC_Utils.close(resultSet,statement,connection);
        }

        return false;
    }
}
