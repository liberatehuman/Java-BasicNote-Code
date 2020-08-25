package d10_synchronized_method;

/*
 * 【解决线程安全问题 方案2-1：同步方法】
 * */
public class Demo {

    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl();

        System.out.println("r："+r);//实现类对象：d10_synchronized_method.RunnableImpl@36baf30c

        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t0.start();
        t1.start();
        t2.start();
    }

}
