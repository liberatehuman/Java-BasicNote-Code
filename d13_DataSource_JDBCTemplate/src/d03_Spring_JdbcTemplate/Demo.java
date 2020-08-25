package d03_Spring_JdbcTemplate;
/*
 * 【Spring JDBC - JdbcTemplate】：Spring 对 JDBC 简单的封装，提供 JdbcTemplate 对象简化 JDBC 开发
 *
 * 【步骤】：
 *  1、导包
 *       - commons-logging-x.x.jar
 *       - spring-beans-x.x.x.RELEASE.jar
 *       - spring-core-x.x.x.RELEASE.jar
 *       - spring-jdbc-x.x.x.RELEASE.jar
 *       - spring-tx-.x.x.x.RELEASE.jar
 *
 *  2、创建 JdbcTemplate 对象，依赖于 DataSource 对象
 *
 *  3、调用 JdbcTemplate 的方法来完成 CRUD 操作
 *
 *       - update()：执行 DML 语句（增/删/改）
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
 *
 * 【注】：JdbcTemplate 同时封装了释放资源的操作
 * */

import druid_utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {
    public static void main(String[] args) {

        //1.导包
        //2.创建 JdbcTemplate 对象，参数传递 DataSource 对象（使用工具类）
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDatasource());

        String sql = "insert into account values(null,?,?)";

        //3.调用方法执行 sql
        int count = jdbcTemplate.update(sql, "卡卡西", 111);
        System.out.println(count);

    }
}
