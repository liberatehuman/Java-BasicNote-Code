package d02_Method;

public class MethodOverloadJudge {
    public static void main(String[] args) {
    }
/*
    1.  public static void open(){}
    2.  public static void OPEN(){}//正确不报错，但不是有效重载
    3.  public void open(){}//static关键字无关，但与1冲突
    4.  static void open(){}//public修饰符无关，但与1冲突
    5.  public static void open(int public_a,int protected_b){}
    6.  public static void open(int x,int y){}//代码错误，与5冲突
    7.  public static void open(double x,int y){}
*/
}