package d03_getName;

/*
 * 【线程名称】
 *
 *      主线程：main
 *      新线程：Thread-0，Thread-1，Thread-2，...
 * */
public class Demo {

    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.start();//Thread-0

        new MyThread().start();//Thread-1（这里是匿名对象，不是多次启动同一线程。开启完线程，销毁对象）
        new MyThread().start();//Thread-2


    }
}
