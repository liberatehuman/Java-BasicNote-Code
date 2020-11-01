package d07_packagingclass;

import java.util.ArrayList;
/*
【包装类】：把基本数据类型及其相关操作方法包装起来的类

        基本类型     包装类型【引用类型】（位于java.lang包下，无需调包）
        byte        Byte
        short       Short
        int         Integer【特】
        long        Long
        float       Float
        double      Double
        char        Character【特】
        boolean     Boolean

    - 自动装箱：基本类型 --> 包装类型
    - 自动拆箱：包装类型 --> 基本类型

    JDK 1.5+支持自动装箱、自动拆箱

    （【ArrayList存储基本类型数据】：必须使用基本类型对应的包装类）
*/
public class Demo {

    public static void main(String[] args) {

        //自动装箱
        Integer a = 5;// <==> Integer a = new Integer(5)

        ArrayList<Integer> arrayList=new ArrayList<>(9);
        arrayList.add(1);// <==> arrayList.add(new Integer(1))

        //自动拆箱
        int b = a + 1;// <==> int b = a.intValue() + 1

    }

}
