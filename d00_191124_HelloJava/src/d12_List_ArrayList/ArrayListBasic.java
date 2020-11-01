package d12_List_ArrayList;

import java.util.ArrayList;

/*
【ArrayList存储基本类型数据】：必须使用基本类型对应的【包装类】

        基本类型     包装类型【引用类型】（位于java.lang包下，无需调包）
        byte        Byte
        short       Short
        int         Integer【特】
        long        Long
        float       Float
        double      Double
        char        Character【特】
        boolean     Boolean

JDK 1.5+ 支持自动装箱、自动拆箱：
        自动装箱：基本类型 --> 包装类型
        自动拆箱：包装类型 --> 基本类型
*/
public class ArrayListBasic {

    public static void main(String[] args) {

        //错误写法！泛型只能是引用类型
        //d12_List_ArrayList<int> intList = new d12_List_ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(20);
        System.out.println(intList); //由于基本数据类型没有地址值，输出的直接是内容

        intList.get(1);
        System.out.println(intList.get(1));
    }
}
