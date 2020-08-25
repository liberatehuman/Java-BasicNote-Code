package d05_object_refer_method;

//用于创建对象的类
public class ReferenceObject {
    //定义成员方法
    public void printUpperCaseString(String s) {//不能 static（静态先于对象，属于类，对象不能调用静态方法）
        System.out.println(s.toUpperCase());
    }
}
