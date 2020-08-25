package d03_Spring_JdbcTemplate;
/*
 * 【Student 的 JavaBean】*/

import java.util.Date;

public class Student {
    //【注】：使用包装类更安全些
    // 防止数据库有些字段的值为 null，可能由成员变量无法接收 null，
    // 会抛异常：springframework.beans.TypeMismatchException（无法将数据库内容转换为...）
    private Integer id;
    private String name;
    private Date birthday;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
