package d04_Lambda_optimize;

/*
* 【 Lambda 表达式优化】：是【可推导】的，可以省略
*
* 【原理】：凡是可根据上下文推导出的内容，都可以省略
*
* 【可省内容】：
*
 *      (参数列表)：参数的"数据类型"可以省略。若只有一个参数，"()、类型"都可省略
*
*       {一些代码}：仅【一行代码】，无论是否有返回值，"{}、return、;"都可省略（要省必须一起省）
*
*------------------------
* 【 Lambda 使用前提】：
*
*  1、必须具有【接口】，且接口中【有且仅有一个抽象方法】（也称"函数式接口"）
*
*  2、必须具有上下文推断
*       （方法的参数/局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例）
*
* */

import d03_Ex2_return_params.Person;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        //JDK 1.7-，创建集合对象必须把前后的泛型都写明
        ArrayList<Integer> arrayList01=new ArrayList<Integer>();

        //JDK 1.7+，= 后的泛型可省略（可根据前面的泛型【推导】出）
        ArrayList<Integer> arrayList02=new ArrayList<>();

        //前面练习的优化
        //new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        //invoke(() -> System.out.println("大厨料理中..."));

        //Arrays.sort(arr, (o1, o2) -> o2.getAge() - o1.getAge());

        //invokeCal(50, 50, (a, b) -> a + b);
    }
}
