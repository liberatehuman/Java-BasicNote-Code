package d06_Transaction;
/*
 * 【JDBC 事务】
 *
 * 【Connection 接口】：数据库连接对象
 *      2)管理事务
 *          - 开启事务：setAutoCommit(boolean autoCommit)，调用该方法并设置参数为 false 开启事务
 *              【执行 sql 之前开启】
 *
 *          - 提交事务：commit()
 *              【所有 sql 执行完提交】
 *
 *          - 回滚事务：rollback()
 *              【在 catch 中回滚】
 *
 * 【练习】：转账
 * */

import util.JDBC_Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;

        try {
            connection = JDBC_Utils.getConnection();
            //【开启事务】
            connection.setAutoCommit(false);

            String sql1 = "update account set balance = balance - ? where id= ?";
            String sql2 = "update account set balance = balance + ? where id= ?";
            //获取 PreparedStatement 对象
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);
            // ? 赋值
            preparedStatement1.setInt(1, 100);
            preparedStatement1.setInt(2, 1);
            preparedStatement2.setInt(1, 100);
            preparedStatement2.setInt(2, 2);
            //执行 sql
            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();

            //【提交事务】
            connection.commit();
        } catch (Exception e) {//因为要回滚，所以选择最大范围异常，包含各种可能
            //【回滚事务】（在 catch 中）
            if (connection != null) {//连接非空判断
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JDBC_Utils.close(null, preparedStatement1, connection);
            JDBC_Utils.close(null, preparedStatement2, connection);
        }
    }
}
