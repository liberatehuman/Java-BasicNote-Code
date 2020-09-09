package my.algorithms.Test;

/* 【两个元素排序】：Comparable 接口（定义排序规则）
 *
 *      定义测试类，通过 Comparable getMax(Comparable c1, Comparable c2) 方法比较
 *
 * 【注】：直接传递 Comparable 抽象类型的数据即可
 * */

import my.algorithms.sort.Student;

public class Sort01_ComparableTest {

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int res = c1.compareTo(c2);//c1c2都是Comparable类型，可调用 int compareTo 方法
        if (res >= 0) {
            return c1;
        } else {
            return c2;
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("热巴", 25);
        Student student2 = new Student("娜扎", 20);

        Comparable max = getMax(student1, student2);
        //Student类实现了Comparable、重写了 compareTo，传入 getMax 执行重写后的 compareTo
        System.out.println(max);
    }

}
