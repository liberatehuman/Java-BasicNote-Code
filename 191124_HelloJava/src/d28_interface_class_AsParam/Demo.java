package d28_interface_class_AsParam;

//【接口/类作为方法的参数】

import java.util.ArrayList;
import java.util.List; //【List接口】是由ArrayList实现的

public class Demo {

    public static void main(String[] args) {

        List<String> mylist=new ArrayList<>();

        System.out.println(method(mylist));
    }

    public static List<String> method(List<String> list){ //接口List作为方法参数
        list.add("咏春");
        list.add("叶问");
        list.add("李小龙");
        return list;
    }
}
