package d03_Demo_JDBC_util;

import util.JDBC_Utils;//导入工具类包
import d02_Exercise.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new Demo().selectAll();
        System.out.println(list);
    }

    public List<Student> selectAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> list = null;

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from student";
            //connection = DriverManager.getConnection("jdbc:mysql:///db01", "root", "alan");
            connection = JDBC_Utils.getConnection();//【获取连接】（包含注册驱动）
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            list = new ArrayList<Student>();
            Student student = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setBirthday(birthday);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBC_Utils.close(resultSet, statement, connection);//【释放资源】
        }
        return list;
    }
}
