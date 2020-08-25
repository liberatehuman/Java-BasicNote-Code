package d03_getName;

/*
 * 【获取线程名称】
 *
 * 【方式】：
 *  1、使用 Thread 类中的 getName 方法
 *
 *        String getName();//返回该线程名称
 *
 *  2、先获取当前正在执行的线程，再用 getName 方法获取名称
 *
 *        static Thread currentThread();//当前正执行的线程对象的引用
 * */
public class MyThread extends Thread {

    @Override
    public void run() {

        //1. getName
        String name = getName();
        System.out.println(name);

        //2. currentThread + getName
        //Thread t=Thread.currentThread();
        //System.out.println(t);
        //System.out.println(t.getName());

        System.out.println(Thread.currentThread().getName());//直接链式
    }
}
