package d05_object_refer_method;
/*
 * 【对象名 引用 成员方法】
 *
 * 【前提】：
 *  1、【对象】是【已经存在的】
 *
 *  2、【成员方法】也是【已经存在的】
 * */

public class Demo {

    public static void method(Printable printable) {
        printable.show("HelloWorld");
    }

    public static void main(String[] args) {

        //Lambda
        method((s) -> {
            ReferenceObject obj = new ReferenceObject();
            obj.printUpperCaseString(s);
        });

        //对象名直接引用成员方法
        ReferenceObject obj = new ReferenceObject();//先创建对象
        method(obj::printUpperCaseString);//引用
    }
}
