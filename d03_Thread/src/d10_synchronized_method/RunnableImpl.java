package d10_synchronized_method;

/*
 * 【同步方法】：解决线程安全问题
 *
 * 【格式】：
 *      权限修饰符 synchronized 返回值类型 方法名 (参) {
 *          可能出现线程安全问题的代码
 *      }
 *
 * 【注】：同步方法的锁对象是【实现类对象（this）】new RunnableImpl()
 * */
public class RunnableImpl implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        System.out.println("this：" + this);//d10_synchronized_method.RunnableImpl@36baf30c

        while (true) {

            sellTicket();

//          等价于
//          synchronized (this){
//              //卖票...
//          }
        }
    }

    //定义同步方法
    public synchronized void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
            ticket--;
        }
    }

}
