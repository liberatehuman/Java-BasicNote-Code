package d05_PreparedStatement;
/*
 * 【PreparedStatement 接口】extends Statement：执行sql的对象
 *      1)解决 SQL 注入问题
 *       （拼接sql语句时，一些sql的特殊关键字参与字符串拼接，造成安全问题）
 *        输入密码：a' or 'a'='a   拼接后："... password='a' or 'a'='a'"，or 后为 true 密码失去意义
 *          - void setXxx(int parameterIndex, String x)：给 ? 赋值
 *
 *      【注】：一般使用 PreparedStatement 执行sql，安全且高效
 *
 * 【步骤】：
 *      1.导入驱动jar包 => 2.注册驱动 => 3.获取连接对象 => 4.定义sql语句【参数用 ? 占位符】=>
 *      5.获取【PreparedStatement】对象 => 6.【给 ? 赋值】=> 7.执行sql => 8.查看结果 => 9.释放资源
 * */

import util.JDBC_Utils;

import java.sql.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名：");
        String name = sc.nextLine();
        System.out.print("密码：");
        String password = sc.nextLine();

        boolean b = new d05_PreparedStatement.Demo().login(name, password);
        if (b) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败");
        }
    }

    public boolean login(String name, String password) {
        if (name == null || password == null) {//用户名密码为空，直接返回false
            return false;
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "select * from jdbc_user where name=? and password=?";//预编译sql用 ? 占位符
            connection = JDBC_Utils.getConnection();
            //获取 PreparedStatement 对象（带参数）
            preparedStatement = connection.prepareStatement(sql);
            //给 ? 赋值
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            //执行 sql（无参数）
            resultSet = preparedStatement.executeQuery();

            return resultSet.next();//若有下一行，返回true
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC_Utils.close(resultSet, preparedStatement, connection);
        }

        return false;
    }
}
