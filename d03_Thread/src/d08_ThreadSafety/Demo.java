package d08_ThreadSafety;

/*
 * 【线程安全问题】：当多个线程的资源可共享，会出现线程安全问题
 *
 * 【举例】：模拟 3 个窗口卖【同一堆票 1-100号 】，已卖完的票何不存在的票（如-1）其他窗口不能再卖
 * */
public class Demo {

    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl();

        Thread t0 = new Thread(r);
        t0.start();
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();

        //结果出现线程安全问题：已卖出的票和不存在的票（如-1），其他窗口还在卖
    }
}
