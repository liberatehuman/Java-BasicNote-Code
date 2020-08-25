package d11_Lock;

/*
 * 【解决线程安全问题 方案3：Lock 锁】
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
