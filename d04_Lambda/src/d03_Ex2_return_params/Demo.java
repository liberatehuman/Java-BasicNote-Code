package d03_Ex2_return_params;

/*
 * 【 Lambda 表达式  练习2-1】：有参、有返回值的接口方法
 * */

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

    public static void main(String[] args) {

        Person[] arr = {
                new Person(20), new Person(25), new Person(23)
        };

        //1.匿名内部类
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person p : arr) {
            System.out.println(p);
        }
        System.out.println("---------------");

        //2. Lambda 表达式重写 Comparator 的 compare 方法
        Arrays.sort(arr, (Person o1, Person o2) -> {//含有参数
            return o2.getAge() - o1.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
