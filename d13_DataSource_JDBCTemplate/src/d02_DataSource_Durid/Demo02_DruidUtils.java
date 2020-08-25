package d02_DataSource_Durid;

import druid_utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02_DruidUtils {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            //使用工具类获取连接对象（包含了连接池的操作）
            connection = DruidUtils.getConnection();

            String sql="insert into account values(null,?,?)";//【注】用 ? 通配符

            preparedStatement = connection.prepareStatement(sql);//注意传参

            preparedStatement.setString(1,"鸣人");//【注】给 ? 赋值
            preparedStatement.setInt(2,666);

            int count = preparedStatement.executeUpdate();
            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //使用工具类释放资源
            DruidUtils.close(connection,preparedStatement);
        }
    }
}
