package d12_waitlong_notifyall;
/*
* 【进入 TimeWaiting（计时等待）状态的两种方式】
*
* 【等待】：
*       void sleep(long millis)：毫秒值结束后，醒来，线程进入 Runnable 或 Blocked 状态
*       void wait(long millis)：毫秒值结束后，未被 notify 唤醒，【自动醒来】进入 Runnable 或 Blocked 状态
*
* 【唤醒】：
*       void notify()：唤醒在此对象监视器（锁对象）上等待的【单个线程】
*       void notifyAll()：唤醒在此对象监视器（锁对象）上等待的【所有线程】
* */
public class Demo {

    public static void main(String[] args) {

        Object obj = new Object();

        //消费者线程（wait(long)自动唤醒）
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    synchronized (obj) {
//                        System.out.println("顾客：下单");
//                        try {
//                            obj.wait(5000);//计时结束自动唤醒
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        //自动唤醒后
//                        System.out.println("顾客自取，开吃");
//                        System.out.println("--------------");
//                    }
//                }
//            }
//        }).start();

        //消费者1 线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1：下单");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子出笼，顾客1开吃");
                        System.out.println("--------------");
                    }
                }
            }
        }).start();

        //消费者2 线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2：下单");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子出笼，顾客2开吃");
                        System.out.println("--------------");
                    }
                }
            }
        }).start();

        //生产者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板做好包子，告知顾客");

                        //obj.notify();//多个线程waiting，只能【随机】唤醒单个线程

                        obj.notifyAll();//唤醒该锁对象监视器下的【所有线程】
                    }
                }
            }
        }).start();
    }

}
