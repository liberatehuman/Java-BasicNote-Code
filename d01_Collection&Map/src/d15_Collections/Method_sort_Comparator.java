package d15_Collections;
/*
 *【java.util.Collections】.【sort（2.Comparator 接口）】：将集合元素按【指定】规则排序
 *
 *      public static <T> void sort(List<T> list, Comparator<? super T> c)
 *
 * ------------------
 * Comparator 与 Comparable【区别】：
 *
 * 1、接口Comparable 的 compareTo 方法：将自己(this)和别人(参数)比较，需要【实现Comparable + 重写compareTo】
 *
 * 2、接口Comparator 的 compare 方法：找一个第三方裁判比较o1，o2两者，需要【重写compare】
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Method_sort_Comparator {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 4, 2, 3);
        System.out.println(list1);//[4,2,3]

        Collections.sort(list1, new Comparator<Integer>() {//匿名内部类创建Comparator对象
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //匿名内部类：省去了创建实现类/子类来实现接口/父类，直接覆写其抽象方法；【只使用唯一一次】
        System.out.println(list1);//[2,3,4]


        //自定义类作为集合元素排序
        Student stu1 = new Student("你", 30);
        Student stu2 = new Student("a我", 25);
        Student stu3 = new Student("他", 35);
        Student stu4 = new Student("b我", 30);
        ArrayList<Student> list2 = new ArrayList<>();
        Collections.addAll(list2, stu1, stu2, stu3, stu4);
        System.out.println(list2);

        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = o1.getAge() - o2.getAge();//先比较年龄
                if (res == 0) {//如果年龄相同，比较名字首字符
                    res = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return res;
            }
        });
        System.out.println(list2);
    }
}
