package d19_interface;
/*
【接口的常量】：相当于"成员变量"，效果上是【常量】
必须用public static final三个关键字进行修饰

格式：
    public static final 数据类型 常量名 = 数据值;  //final修饰表示不可变

【注】：
1、接口中的常量【必须被赋值】，不赋值也【没有默认值】
2、接口中的常量名必须【大写】，多个单词组成用【下划线】分割
3、三个关键字可选择性忽略
*/
public class MyInterfaceConstUse {

    public static void main(String[] args) {

        System.out.println(MyInterfaceConst.LUCKY_NUM);
    }
}
