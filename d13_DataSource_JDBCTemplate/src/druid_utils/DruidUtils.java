package druid_utils;
/*
 * 【Druid JDBC工具类】
 *
 *       不用每次使用都建立数据库连接池
 * */

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {
    //成员变量：数据库连接池接口 Datasource
    private static DataSource datasource;

    //静态代码块：加载配置 & 建好连接池
    static {
        try {
            //加载配置文件
            Properties properties = new Properties();
            InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(is);

            //用工厂类获取连接池对象
            datasource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //获取连接对象
    public static Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }

    //释放资源【重载】（供不需要 ResultSet 时调用）
    public static void close(Connection c, Statement s) {
        close(null, c, s);//即调用 3 个参数的重载方法，只是设 rs=null
    }

    //Druid 只是连接池，使用数据库还是会有这些对象，需要释放资源
    public static void close(ResultSet rs, Connection c, Statement s) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (c != null) {
            try {
                c.close();//【归还】连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //获取连接池对象（创建 JdbcTemplate 对象传参需要）
    public static DataSource getDatasource() {
        return datasource;
    }

}
