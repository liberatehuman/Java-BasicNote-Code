package d01_DataSource_C3P0;
/*
 * 【C3P0 演示】：自定义配置、遍历查看最大数量的连接对象、归还
 * */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo02 {
    public static void main(String[] args) throws SQLException {
        //DataSource dataSource = new ComboPooledDataSource();//无参构造是默认配置
        DataSource dataSource = new ComboPooledDataSource("myc3p0");//参数传递自定配置名

        for (int i = 1; i <= 10; i++) {//遍历最大连接数量的连接对象
            Connection connection = dataSource.getConnection();

            if (i == 5) {
                connection.close();//归还第 5 个连接对象到连接池中
                //归还后，后面能再次使用该对象（打印结果有两个地址值相同）
            }

            System.out.println(i + ":" + connection);
        }
    }
}
