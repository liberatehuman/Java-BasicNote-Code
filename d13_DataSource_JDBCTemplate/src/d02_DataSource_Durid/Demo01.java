package d02_DataSource_Durid;
/*
 * 【数据库连接池技术-2】：Druid（强大）
 *
 * 【步骤】：
 *  1、导包到 libs 目录下，Add as library
 *       - druid-x.x.x.jar
 *       - mysql-connector-java-x.x.x.jar（别忘）
 *
 *  2、定义配置文件
 *       - 【任意名称】.【properties】【任意位置】
 *
 *  3、加载配置文件（Properties加载）
 *
 *  4、获取 数据库连接池对象：
 *       - 通过【工厂类 DruidDataSourceFactory】.createDataSource() 获取
 *
 *  5、获取 连接对象：getConnection()
 * */

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws Exception {

        //1.导包
        //2.定义配置文件
        //3.加载配置文件
        Properties properties = new Properties();
        properties.load(new FileReader("/Users/ZHD/Documents/Idea Java projects/d13_DataSource_JDBCTemplate/src/druid.properties"));

        //4.获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5.获取连接对象
        Connection connection = dataSource.getConnection();

        System.out.println(connection);
    }
}
