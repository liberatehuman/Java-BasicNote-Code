package d01_JDBCDemo;
/*
 * 【练习1】：在 account 表中添加一行数据
 *
 * 【注】：
 *      异常捕获处理，不要声明抛出，防止中途抛异常影响后续代码；
 *      释放资源在 finally 中；
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01_insert {

    public static void main(String[] args) {

        //为了在 finally 中释放资源，所以扩大 try 中 Connection 和 Statement 对象作用域（否则抛异常）
        Connection connection = null;//在 try 中赋值使用即可
        Statement statement = null;//在 try 中赋值使用即可

        try {
            Class.forName("com.mysql.jdbc.Driver");//ClassNotFoundException
            String sql = "insert into account values(null,'小明',500)";
            connection = DriverManager.getConnection("jdbc:mysql:///db01",
                    "root", "alan");//SQLException
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            //处理结果
            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println("执行失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {//释放资源
            if (statement != null) {//先加非空判断，防止NullPointerException
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {//先加非空判断，防止NullPointerException
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
