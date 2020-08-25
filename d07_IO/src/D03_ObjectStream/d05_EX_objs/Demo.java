package D03_ObjectStream.d05_EX_objs;
/*
 * 【练习：序列化对象集合】
 *
 *       想在文件中保存多个对象时，可先将对象保存在集合中，【直接对集合】序列化与反序列化
 * */

import java.io.*;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //保存对象的集合
        List<Person> list = List.of(new Person("小明", 20),
                new Person("小红", 18), new Person("小白", 10));

        //数据源和目的地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "d07_IO//src//D03_ObjectStream//Persons.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "d07_IO//src//D03_ObjectStream//Persons.txt"));

        //序列化整个集合
        oos.writeObject(list);

        //反序列化集合
        Object o = ois.readObject();

        //强制转换读取内容为集合
        List<Person> list2 = (List<Person>) o;

        //遍历集合
        for (Person p : list2) {
            System.out.println(p);
        }

        //释放资源
        oos.close();
        ois.close();

    }
}
