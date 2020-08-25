package d02_FunctionalCoding;

/*
 * 【函数式接口】-- 作为方法【参数】
 *
 * 【举例】：
 *      - java.lang.Runnable （函数式）接口
 *
 *      - Thread 类含参构造方法的参可传入接口
 * */
public class D02_FunctionalInterface_param {

    public static void main(String[] args) {

        //1.匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->启动");
            }
        }).start();

        //2.Lambda 表达式
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "-->启动")).start();
    }
}
