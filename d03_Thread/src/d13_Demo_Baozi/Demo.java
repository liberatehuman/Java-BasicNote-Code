package d13_Demo_Baozi;

/*
 * 【等待唤醒机制案例（线程间的通信）】：店铺、顾客和包子
 *
 *  线程A：店铺（线程任务：生产包子）
 *
 *  线程B：店铺（线程任务：吃包子）
 *
 *  资源：包子（有/无两种状态）
 *
 *      通信内容：根据两个线程中的包子状态，决定其进入等待或进行唤醒
 *
 * */
public class Demo {

    public static void main(String[] args) {

        Baozi bz = new Baozi();

        new Shop(bz).start();
        new Consumer(bz).start();
    }

}
