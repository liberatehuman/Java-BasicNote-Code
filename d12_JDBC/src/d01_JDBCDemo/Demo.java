package d01_JDBCDemo;
/* 【JDBC 接口的使用】
 *
 * 【步骤】：
 *      1.导入驱动jar包 => 2.注册驱动 => 3.获取连接对象 => 4.定义sql语句 =>
 *      5.获取执行sql的Statement对象 => 6.执行sql => 7.查看结果 => 8.释放资源
 *
 * 【对象功能详解】：
 *  1.【DriverManager 类】：驱动管理对象
 *      1)注册驱动，告诉程序该使用哪一个数据库驱动jar
 *          - static void registerDriver(java.sql.Driver driver)
 *          写代码时：Class.forName("com.mysql.jdbc.Driver");//Driver类包含注册驱动静态代码块，该句可完成注册
 *          static {try { DriverManager.registerDriver(new Driver());}
 *                  catch (SQLException var1) {throw new RuntimeException("Can't register driver!");}}
 *      2)获取数据库连接
 *          - static Connection getConnection(String url, String user, String password)
 *              url：指定连接路径（若地址为本机且端口号默认3306，则可略）
 *                  "jdbc:mysql://IP 地址:端口号/数据库名"（"jdbc:mysql:///数据库名"）
 *
 *  2.【Connection 接口】：数据库连接对象
 *      1)获取执行 sql 的 statement 对象
 *          - Statement createStatement()
 *          - PreparedStatement prepareStatement(String sql)
 *      2)管理事务
 *          - 开启事务：setAutoCommit(boolean autoCommit)，调用该方法并设置参数为 false，即开启事务
 *          - 回滚事务：commit()
 *          - 提交事务：rollback()
 *
 *  3.【Statement 接口】：执行sql的对象
 *      1)执行 sql
 *          - boolean execute(String sql)：可执行任意sql语句（了解）
 *          - int executeUpdate(String sql)：执行 DML(insert/update/delete)、DDL(create/alter/drop)语句
 *              返回值：语句影响的行数（<0 表示执行失败）
 *          - ResultSet executeQuery(String sql)：执行 DQL 语句
 *
 *  4.【ResultSet 接口】：结果集对象
 *      1)封装查询结果
 *          - boolean next()：游标向下移动一行（初始在行头），返回值判断当前行是否为末行
 *          - getXxx(参数)：获取数据
 *              Xxx：数据类型，返回值与数据类型一致，如 int getInt()
 *              参数：int 或 String 类型的值，表示列的编号(从1开始)或列名
 *
 *  5.【PreparedStatement 接口】extends Statement：执行sql的对象
 *      1)解决 SQL 注入问题
 *       （拼接sql语句时，一些sql的特殊关键字参与字符串拼接，造成安全问题）
 *        输入密码：a' or 'a'='a   拼接后："... password='a' or 'a'='a'"，or 后为 true 密码失去意义
 *          - void setXxx(int parameterIndex, String x)：给 ? 赋值
 *
 *      【注】：一般使用 PreparedStatement 执行sql，安全且高效
 *
 *  以上都是面向接口编程
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) throws Exception {

        //1.导入驱动jar包（右上角Project Structure设置dependencies）
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");// mysql 5+驱动jar包，可忽略注册驱动步骤

        //3.获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01",
                "root", "alan");

        //4.定义 sql 语句
        String sql = "update account set balance=200";

        //5.获取执行 sql 的 Statement 对象
        Statement statement = connection.createStatement();

        //6.执行 sql
        int count = statement.executeUpdate(sql);//返回影响行数

        //7.查看结果
        System.out.println(count);

        //8.释放资源
        statement.close();
        connection.close();
    }
}
