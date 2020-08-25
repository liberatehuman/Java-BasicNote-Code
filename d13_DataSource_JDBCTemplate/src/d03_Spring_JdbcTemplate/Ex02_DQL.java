package d03_Spring_JdbcTemplate;
/*
 * 【JdbcTemplate 练习】：DQL
 *
 *  4、查询所有记录，结果集封装为 Map 集合
 *  5、查询所有记录，结果集封装为 List 集合
 *  6、查询所有记录，结果集封装为 Student 对象泛型的 List 集合
 *  7、查询总记录数
 *
 *       - queryForMap()：查询结果，将结果集封装为 Map 集合
 *          # key = 列名，value = 值
 *          # 只能成功查询【1 条】（结果集长度只能为1）
 *
 *       - queryForList()：查询结果，将结果集封装为 List 集合
 *          # 结果集的每一条记录封装成 Map，再把Map封装为 List
 *
 *       - query()：查询结果，将结果集封装为 JavaBean 对象
 *          # 参数：sql 和【RowMapper<T>】
 *          # 一般使用实现类【BeanPropertyRowMapper<T>】，完成数据到 JavaBean 的自动封装
 *              new BeanPropertyRowMapper<类型>(类型.class)
 *
 *       - queryForObject()：查询结果，将结果集封装为对象
 *          # 参数：sql 和 传递查询列的【类型.class】
 *  */

import druid_utils.DruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Ex02_DQL {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDatasource());

    //4.查询所有记录，结果集封装为 Map 集合
    @Test
    public void testQueryOne() {
        String sql = "select * from student where id=?";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 1);//正确结果集个数只能为1
        System.out.println(map);
    }

    //5.查询所有记录，结果集封装为 List 集合
    @Test
    public void testQueryAll_List() {
        String sql = "select * from student";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : mapList) {
            System.out.println(map);
        }
    }

    //6.查询所有记录，结果集封装为 Student 对象泛型的 List 集合，
    // query 参数传递 RowMapper<T> 接口，可以自己重写实现 mapRow 方法（数据封装为JavaBean对象）
    @Test
    public void testQueryAll_StudentList() {
        String sql = "select * from student";
        List<Student> studentList = jdbcTemplate.query(sql, new RowMapper<Student>() {
            //重写 mapRow 方法
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();

                int id = resultSet.getInt("id");//获取结果集，并转换为可接收的值
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");

                student.setId(id);//赋值给对象的成员变量
                student.setName(name);
                student.setBirthday(birthday);

                return student;//返回对象
            }
        });
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    //6.【基于 Spring 的改进】
    // query 传递【BeanPropertyRowMapper<T>】对象（实现了 RowMapper<T>）
    // 直接获取对象类的字节码文件，并转换为对象的List集合
    @Test
    public void testQueryAll_StudentList_Spring() {
        String sql = "select * from student";
        List<Student> studentList = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<Student>(Student.class));//构造传递字节码文件
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    //7.查询总记录数
    @Test
    public void testQueryCount() {
        String sql = "select count(id) from student";//聚合函数直接查询
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);//传递查询列的类型的字节码文件
        System.out.println(count);
    }

}
