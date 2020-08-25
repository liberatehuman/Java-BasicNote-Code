package d07_innerClassThread;
/*
* 【匿名内部类 创建线程】
*
* 【作用】：简化代码
*
*       子类继承父类   + 重写父类方法 + 创建子类对象  => 一步完成
*       实现类实现接口 + 重写接口方法 + 创建实现类对象 => 一步完成
*
* 【格式】：
*       new 父类名/接口名() {
*           重写父类/接口方法
*       };
* */
public class Demo {

    public static void main(String[] args) {

        //1. 线程的父类是 Thread
        //常规：new MyThread().start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        //2. 线程的接口是 Runnable
        //常规：Runnable r = new RunnableImpl();//多态
        Runnable r = new Runnable(){//多态（右边不是new接口，是创建匿名内部对象）
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        new Thread(r).start();

        //简写，整体传参
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();

    }
}
