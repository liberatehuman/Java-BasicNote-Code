package d07_MyException;

/*
 *【自定义异常类】：java提供的异常类不够使用，需要自定义一些异常类（程序图标变为闪电）
 *
 *【格式】：
 *       public class XxxException {
 *           无参构造方法
 *           带异常信息的构造方法
 *       }
 *
 *【注】：
 * 1、自定义异常类一般以 Exception结尾
 * 2、自定义异常类必须继承 Exception 或 RuntimeException
 *       extends Exception：编译异常，方法内部抛出编译异常，必须 throws/try catch 处理
 *       extends RuntimeException：运行异常，无需处理，交给 JVM 中断处理
 * */
public class RegisterException extends Exception {

    //无参构造
    public RegisterException() {
        super();
    }

    //带异常信息的构造
    //参考源码，会调用父类Exception的构造方法
    //如：public NullPointerException(String s) {super(s);}
    public RegisterException(String message) {
        super(message);
    }

}
