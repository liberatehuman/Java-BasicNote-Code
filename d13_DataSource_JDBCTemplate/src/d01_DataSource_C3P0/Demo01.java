package d01_DataSource_C3P0;
/*
 * 【数据库连接池技术-1】：C3P0
 *
 * 【步骤】：
 *  1、导包到新建 libs 目录下，均右键选为【Add as library】
 *       - c3p0-x.x.x.x.jar
 *       - mchange-commons-java-x.x.x.jar
 *       - mysql-connector-java-x.x.x.jar（别忘）
 *
 *  2、定义配置文件
 *       - c3p0-config.xml 配置文件（名字必须这么写）放在 src 目录下
 *
 *  3、创建 数据库连接池对象：ComboPooledDataSource（核心）（父类接口接收）
 *
 *  4、获取 连接对象：Connection getConnection()
 * */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo01 {

    public static void main(String[] args) throws SQLException {
        //1.导包...
        //2.定义配置文件...
        //3.获取数据库连接池对象
        DataSource dataSource = new ComboPooledDataSource();//父类接口接收

        //4.获取连接对象
        Connection connection = dataSource.getConnection();

        //查看连接对象
        System.out.println(connection);
    }
}
