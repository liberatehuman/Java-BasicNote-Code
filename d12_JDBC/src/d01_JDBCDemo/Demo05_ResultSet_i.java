package d01_JDBCDemo;
/*
 * 【练习5】：遍历结果集  while(resultSet.next()){...}
 * */
import java.sql.*;

public class Demo05_ResultSet_i {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from account";
            connection = DriverManager.getConnection("jdbc:mysql:///db01",
                    "root", "alan");
            statement = connection.createStatement();
            //执行DQL查询
            resultSet = statement.executeQuery(sql);
            //游标下移一行
            while (resultSet.next()){
                //获取数据
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                int balance = resultSet.getInt("balance");
                //处理结果
                System.out.println(id + "--" + name + "--" + balance);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {//释放资源
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
