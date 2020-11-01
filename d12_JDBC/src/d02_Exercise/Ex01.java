package d02_Exercise;
/*
 * 【练习】：定义一个方法，查询表中数据，将其结果封装为对象，装载进集合并返回
 *
 *      定义 Student 类
 *      定义方法 public List<Student> selectAll()
 *      实现方法 select * from student
 * */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Student> list = new Ex01().selectAll();//调用方法
        System.out.println(list);
    }

    //定义方法
    public List<Student> selectAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> list = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from student";
            connection = DriverManager.getConnection("jdbc:mysql:///db01",
                    "root", "alan");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            list = new ArrayList<Student>();
            Student student = null;//循环外复用一个引用，即可（不需要每次创建引用）
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");

                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setBirthday(birthday);
                list.add(student);//装载进集合
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
        return list;
    }
}
