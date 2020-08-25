package d01_mainThread;

/*
 * 【主线程】：执行 main 方法的线程
 *
 *  单线程程序：程序中只有一个线程
 *  执行顺序：从 main 方法开始，从上到下依次执行
 *
 *  JVM 执行 main 方法 --> main 方法进入栈内存 --> JVM 找 OS 开辟主(main)线程 --> CPU 通过该线程执行main方法
 *
 * 【单线程缺点】：程序一个任务出现异常，后续任务就无法执行
 * */
public class Demo {

    public static void main(String[] args) {

        Person p1 = new Person("老大");
        p1.run();

        System.out.println(0 / 0);//Exception in【thread "main"】java.lang.ArithmeticException:...

        //后面程序无法执行
        Person p2 = new Person("老二");
        p2.run();
    }
}
