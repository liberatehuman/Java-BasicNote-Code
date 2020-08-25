package d10_generic泛型;
/*
 * 【泛型】：集合内可放任意对象，当不确定何种数据类型，可用泛型
 *
 * 【优】：
 *  1、确定存储类型是什么，取出的就是什么，避免类型转换
 *
 *  2、运行时异常 --提前至--> 编译期异常
 *
 *  （ 集合在不使用泛型时，默认存储类型为Object，【劣】：不安全，引发运行异常 ）
 *
 *      <E>: Elements 元素
 *      <T>: Type 类型
 * */

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        //【不用泛型】
//        ArrayList arrayList = new ArrayList();//集合不用泛型时，默认元素为Object类型
//        arrayList.add("abc");
//        arrayList.add(9);
//
//        Iterator iterator = arrayList.iterator();
//
//        while (iterator.hasNext()){
//            Object obj = iterator.next();//Object接收
//            System.out.println(obj);
//
//            //向下转型（Object不能用String的.length方法）
//            String s = (String) obj;//【运行异常】：ClassCastException，不能把Integer转为String
//            System.out.println(s.length());
//        }

        //【使用泛型】
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("999");
        //arrayList.add(9);
        //  ↑ 【编译异常】：add(java.lang.String)in ArrayList cannot be applied to(int)

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s.length());
        }

    }
}
