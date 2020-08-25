package d02_Thread;

/*
 * 【实现多线程程序 -- 方式 1】：创建 Thread 类的子类
 *
 * 【java.lang.Thread 类】：描述线程的类，要想实现多线程，必须继承 Thread
 *
 * 【实现步骤】：
 * 1、创建一个 Thread 类的子类
 *
 * 2、子类重写 Thread 类的 run 方法
 *
 * 3、创建这个 Thread 子类的对象
 *
 * 4、调用 Thread 类中的 start 方法，启动新线程，执行 run 方法
 *
 *       void start();//使该线程开始执行，JVM 调用该线程的 run 方法
 *
 *       结果：main 线程和此线程【并发】地运行（随机性打印 <-- 抢占式调度）
 *
 *     -【注】：多次启动一个线程是非法的，尤其是当线程已结束执行后，不能再重启
 * */
public class Demo {

    public static void main(String[] args) {
        //1. 创建 MyThread 继承 Thread
        //2. MyThread 类重写 run 方法
        //3. 创建线程类对象
        MyThread mt = new MyThread();

        //4. 调用 Thread 的 start 方法
        mt.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("thread main:" + i);
        }

        //抢占式调度：看谁先抢到CPU使用权，并发执行，而不是顺序执行
    }
}
