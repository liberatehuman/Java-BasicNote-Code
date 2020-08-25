package d10_generic泛型;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型通配符高级用法：【泛型的上/下限定】
 *
 * 1.【泛型的上限】：? extends E   使用的泛型 ? 只能是泛型 E 的子类/本身
 * 2.【泛型的下限】：? super   E   使用的泛型 ? 只能是泛型 E 的父类/本身
 *
 * 【类与类】的继承关系：（泛型没继承关系）
 *      Integer extends Number extends Object
 *      String  extends -------------> Object
 *
 * 【注】：也可以通过泛型方法实现：<T extends/super A> void method(List<T> list)
 * 泛型方法更灵活，通配符只能接收数据（安全性）
 * */
public class GenericSymbol_extends_super {

    public static void main(String[] args) {

        //不同数据类型的集合
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        //1.上限为Number，只能运行：
        getExtends(list1);
        getExtends(list3);
        //getExtends(list4);//Object是Number父类，超过上限
        //getExtends(list2);//String跟Number无继承关系

        //2.下限为Number，只能运行：
        getSuper(list3);
        getSuper(list4);
        //getSuper(list1);//Integer是Number子类，超过下限
        //getSuper(list2);//String跟Number无继承关系
    }

    public static void getExtends(Collection<? extends Number> collection) {
        System.out.println("泛型上限：Number");
    }

    public static void getSuper(Collection<? super Number> collection) {
        System.out.println("泛型下限：Number");
    }
}
