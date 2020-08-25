package d06_tips;

/*
 * 【子父类异常】
 *
 * 1、若父类抛出多个异常，子类重写父类方法时，必须【 1.抛出和父类相同异常 /2.抛出父类异常的子类 /3.不抛 】
 * 2、若父类没有抛出异常，子类重写父类方法时，也【不可抛出】。若子类产生异常，只能try catch【捕获处理】，不能声明抛出
 *
 * 【注】：
 * */
public class T3_extends {

    public static void method01() throws NullPointerException, ClassCastException {
    }

    public static void method02() throws IndexOutOfBoundsException {
    }

    public static void method03() throws IndexOutOfBoundsException {
    }

    public static void method04() {
    }
}


class Zi extends T3_extends {

    //1.重写父类方法，抛出和父类相同异常
    public static void method01() throws NullPointerException, ClassCastException {
    }

    //2.重写父类方法，抛出父类异常的子类
    public static void method02() throws ArrayIndexOutOfBoundsException {
    }

    //3.重写父类方法，不抛异常
    public static void method03() {
    }

    //4.父类方法无异常，子类也无异常
    public static void method04() {
        //子类产生异常，只能捕获处理，不能声明
        try {
            throw new Exception("编译异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
