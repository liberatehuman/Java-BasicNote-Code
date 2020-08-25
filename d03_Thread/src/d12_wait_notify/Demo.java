package d12_wait_notify;
/*
* 【等待唤醒】：线程间的通信
*
* 【方法】：Object 类中
*
*       void wait()：直到其他线程调用【此对象（锁对象）】的 notify 方法前，无限等待
*
*       void notify()：唤醒在此对象监视器上(锁对象)等待的【单个线程】，并执行其后续代码
*
* 【案例】：
*       消费者买包子下单，调用 wait 方法，放弃 CPU 使用权，进入 Waiting（无限等待）状态；
*       生产者做完包子，调用 notify 方法，唤醒消费者吃包子
*
* 【注】：
*  1、等待和唤醒同时只能有一个执行，必须使用【同步】技术
*  2、同步必须使用【唯一锁对象】（唤醒的是对应的等待）
*  3、只有【锁对象】才能调用 wait 和 notify 方法
* */
public class Demo {

    public static void main(String[] args) {

        //创建唯一锁对象
        Object obj = new Object();

        //消费者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    //等待/唤醒同时只能有一个执行，必须用同步技术
                    synchronized (obj) {
                        System.out.println("顾客：下单");

                        //调用 wait 无限等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //待被 notify 唤醒后
                        System.out.println("包子出笼，顾客开吃");
                        System.out.println("--------------");
                    }
                }
            }
        }).start();

        //生产者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //一直经营
                while (true) {

                    //做包子中，等待5s（可保证消费者线程先执行）
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //等待/唤醒同时只能有一个执行，必须用同步技术
                    synchronized (obj) {
                        System.out.println("老板做好包子，告知顾客");

                        //调用 notify 唤醒
                        obj.notify();
                    }
                }
            }
        }).start();
    }


}
