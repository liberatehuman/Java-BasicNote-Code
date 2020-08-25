package util;
/*
 * 【自定义JDBC工具类】：将重复冗余的代码提高可扩展性
 *
 *  通过配置文件获取driver、url、user、password，只需修改配置文件，无需改动代码
 * */

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.*;
import java.util.Properties;

public class JDBC_Utils {
    //静态成员变量（作为获取连接方法的参数）
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    //静态代码块（预先配置好连接所需信息）
    static {
        try {
            //创建 Properties 对象
            Properties properties = new Properties();

            //从当前类获取一个类加载器
            ClassLoader classLoader = JDBC_Utils.class.getClassLoader();

            //绑定配置文件名，获取其 URL
            URL resource = classLoader.getResource("JDBC.properties");

            //获取配置文件所在路径
            String path = resource.getPath();
            //URL.getPath将路径/Users/ZHD/Documents/Idea Java projects/...中的空格以%20表示，需要设置编码
            path= URLDecoder.decode(path,"UTF-8");
            System.out.println(path);

            //根据配置文件路径，通过输入流接收，加载到内存
            properties.load(new FileReader(path));

            //获取配置文件数据
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");

            //注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取连接方法（静态）
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);//传递静态成员变量
    }

    //释放资源方法（）静态
    public static void close(ResultSet rs, Statement s, Connection c) {
        if (rs != null) {
            try {
                rs.close();
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
        if (c != null) {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
