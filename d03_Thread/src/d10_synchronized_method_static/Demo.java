package d10_synchronized_method_static;

/*
 * 【解决线程安全问题 方案2-2：静态的同步方法】
 * */
public class Demo {

    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl();

        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t0.start();
        t1.start();
        t2.start();
    }

}
