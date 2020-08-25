package d09_synchronized_obj;

/*
 * 【同步代码块】：解决线程安全问题
 *
 * 【格式】：
 *       synchronized (锁对象) {
 *           可能出现线程安全问题的代码
 *       }
 *
 * 【注】：
 *  1、同步代码块中的锁对象可以是【任意对象】
 *
 *  2、但必须保证多个线程使用的是【同一个锁对象】（不能创建在run方法内）
 *
 *  3、锁对象作用：锁住同步代码块，只允许一个线程在同步代码块中执行
 * */
public class RunnableImpl implements Runnable {

    private int ticket = 100;

    //创建锁对象（在run方法外创建）
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (obj) {//获取锁/加锁
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
                    ticket--;
                }
            }//释放锁/解锁

        }
    }

}
