package d11_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 【java.util.concurrent.locks.Lock 接口】：解决线程安全问题
 *
 *      Lock 提供了比使用 synchronized 更广泛的锁定操作
 *
 * 【方法】：
 *      void lock()：获取锁
 *      void unlock()：释放锁
 *
 *  java.util.concurrent.locks.【ReentrantLock 类】 implements Lock 接口
 *
 * 【使用步骤】：
 * 1、在成员位置创建一个 ReentrantLock 对象
 * 2、在可能出现线程安全问题的代码【前】，调用 Lock 接口的 lock 方法
 * 3、在可能出现线程安全问题的代码【后】，调用 Lock 接口的 unlock 方法
 *
 * 【注】：unlock 方法常写在【finally】代码块中，无论是否抛异常，都会释放锁，不影响其他线程执行
 * */
public class RunnableImpl implements Runnable {

    private int ticket = 100;

    //1.创建一个 ReentrantLock 对象
    Lock lock = new ReentrantLock();

//    @Override
//    public void run() {
//        while (true) {
//
//            //2.获取锁
//            lock.lock();
//
//            if (ticket > 0) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
//                ticket--;
//            }
//
//            //3.释放锁
//            lock.unlock();
//        }
//    }

    @Override
    public void run() {
        while (true) {
            //2.获取锁
            lock.lock();

            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally { //无论是否抛异常，都会释放锁，不影响其他线程的执行
                    //3.释放锁
                    lock.unlock();
                }
            }

        }
    }

}
