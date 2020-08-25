package d04_setName;
/*
 * 【设置线程名】（了解）
 *
 * 方式：
 * 1、使用 Thread 类中的 setName 方法
 *       void setName(String name);//改变线程名称为 name
 *
 * 2、创建含参构造方法，参数为设置线程名。调用父类(Thread)含参构造方法，将线程名传参给父类，让父类给子线程起名
 *       Thread(String name);//分配新的 Thread 对象
 *
 * */

public class Demo {

    public static void main(String[] args) {

        MyThread mt = new MyThread();

        //1. setName
        mt.setName("线程-0");
        mt.start();


        //2. 调用父类 Thread(String name)
        new MyThread("线程-1").start();
        new MyThread("线程-2").start();

    }
}
