package d02_Thread;

//1. 创建继承 Thread 的线程类
public class MyThread extends Thread {

    //2. 重写 Thread 类的 run 方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread RunnableImpl: " + i);
        }
    }

}
