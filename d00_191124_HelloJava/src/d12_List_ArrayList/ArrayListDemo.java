package d12_List_ArrayList;
/*
数组缺点：一旦创建，长度就不可改变

【集合类1：d12_List_ArrayList】：一种【容器】，相比数组，【长度可任意改变】

d12_List_ArrayList<E>中的<E>表示【泛型】：装在集合当中的元素统一为什么类型

【注】：泛型只能是引用类型
*/

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new java.util.ArrayList<>();//JDK1.7+，右<>可不用再写一遍泛型

        System.out.println(list); //内容为空时，打印出的只是[]

        list.add("迪丽热巴");
        list.add("古力娜扎");
        System.out.println(list); //ArrayList打印的直接是内容，而不是地址值（源码有ToString..）
    }

}
