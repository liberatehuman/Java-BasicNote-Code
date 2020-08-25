package d14_ThreadPool;
/*
 * 【线程池】：解决较多线程并发，导致频繁创建和销毁线程对象的浪费问题（JDK 1.5）
 *
 * 【java.util.concurrent.Executors 类】：线程池的工厂类，用来生成线程池
 *
 *  静态方法：
 *       - static ExecutorService newFixedThreadPool (int nThreads)：创建一个可重用固定线程数的线程池
 *
 *           参数：线程数
 *           返回值：【ExecutorService 接口】实现类对象，可用 ExecutorService 接收（面向接口编程）
 *
 * 【java.util.concurrent.ExecutorService 接口】：线程池接口，用于从线程池中获取线程，执行任务
 *
 *       - submit(Runnable task)：提交一个 Runnable 任务用于执行
 *
 *       - void shutdown()：关闭/销毁线程池的方法（*不建议使用）
 *
 * 【使用步骤】：
 *  1、使用线程池工厂类 Executors 生产指定线程数的线程池
 *
 *  2、创建线程类，实现 Runnable 接口，重写 run 方法
 *
 *  3、调用 ExecutorService 的 submit 方法，传递线程实现类 -> 开启线程 -> 执行方法
 *
 *  4、调用 ExecutorService 的 shutdown 方法，关闭/销毁线程池（*不建议使用）
 *
 * */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {

        //1.生产指定线程数的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        //3.调用 submit 方法，传递线程实现类 -> 开启线程 -> 执行方法
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //* 4.调用 shutdown 方法，关闭/销毁线程池
        es.shutdown();

        //线程池已被销毁，无法再提交
        es.submit(new RunnableImpl());//抛异常java.util.concurrent.RejectedExecutionException

    }
}
