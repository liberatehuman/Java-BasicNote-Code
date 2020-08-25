package d14_ThreadPool;

//2.创建线程类，实现 Runnable 接口，重写 run 方法
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
