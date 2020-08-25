package d01_JDBCDemo;
/*
 * 【练习3】：在 account 表中删除一行数据
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03_delete {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "delete from account where id=3";
            connection = DriverManager.getConnection("jdbc:mysql:///db01",
                    "root", "alan");
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println("执行失败");
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
        }

    }
}
