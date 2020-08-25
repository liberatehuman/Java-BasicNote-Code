package d12_List_ArrayList;
/*
自定义一个打印集合的方法，替换掉原本[元素1,...]格式，用{元素1|元素2|...}

SystemDemo.out.println(list);   [1,2,3]
ArrayListPrint(list);       {1|2|3}
*/

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<String> selfList=new ArrayList<>();

        selfList.add("I");
        selfList.add("have");
        selfList.add("an");
        selfList.add("apple");

        System.out.println(selfList);
        ArrayListPrint(selfList);
    }

    public static void ArrayListPrint(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"|");
        }
        System.out.println("}");
    }

}
