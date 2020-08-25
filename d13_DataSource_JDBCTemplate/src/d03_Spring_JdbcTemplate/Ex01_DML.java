package d03_Spring_JdbcTemplate;
/*
 * 【JdbcTemplate 练习】：DML
 *
 *  1、修改一条记录
 *  2、添加一条记录
 *  3、删除一条记录
 *
 *  （使用单元测试分别执行）
 *  */

import druid_utils.DruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class Ex01_DML {
    //定义一个静态 JdbcTemplate 成员变量，便于后面调用
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDatasource());

    //1.修改一条记录
    @Test
    public void testUpdate() {
        String sql = "update people set math=99 where name='马克思'";
        int count = jdbcTemplate.update(sql);
        System.out.println(count);
    }

    //2.添加一条记录
    @Test
    public void testInsert() {
        String sql = "insert into people(id,name,sex) values(?,?,?)";
        int count = jdbcTemplate.update(sql, 1, "我", "23");
        System.out.println(count);
    }

    //3.删除一条记录
    @Test
    public void testDelete() {
        String sql = "delete from people where name=?";
        int count = jdbcTemplate.update(sql, "我");
        System.out.println(count);
    }
}
