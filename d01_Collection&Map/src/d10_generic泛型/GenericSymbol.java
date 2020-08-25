package d10_generic泛型;
/*
 * 【泛型通配符 ? 】：当不确定集合元素数据类型时，可以用通配符 ? 接收；
 *
 *      ? 表示任意数据类型
 *
 * 【注】：
 *  1、只能作为方法的【参数】使用（只能接收(读取)数据，不能往集合中存储元素）
 *  2、【不能创建对象使用】：ArrayList<?> arrayList = new ArrayList<>()
 *
 * */

import java.util.ArrayList;
import java.util.Iterator;

public class GenericSymbol {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();//存储类型为Integer
        arrayList1.add(111);
        arrayList1.add(666);

        ArrayList<String> arrayList2 = new ArrayList<>();//存储类型为String
        arrayList2.add("Hello ");
        arrayList2.add("World!");

//        ArrayList<?> arrayList3=new ArrayList<>(); 创建不报错，但是不能进行任何操作
//        arrayList3.add(1); //报错

        printMethod(arrayList1);
        printMethod(arrayList2);
    }

    //无论元素类型，都能打印集合元素的【通用方法】：
    public static void printMethod(ArrayList<?> arrayList) {//参数类型?：表示任意数据类型

        Iterator<?> iterator = arrayList.iterator();//Iterator的存储类型也是?
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
