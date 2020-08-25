package d01_Runnable;

public class Demo {

    public static void main(String[] args) {

        //1.创建 Runnable 接口的实现类对象
        Runnable r = new RunnableImpl();
        //2.创建 Thread 类对象，参数为 Runnable 接口实现类对象
        Thread t = new Thread(r);
        //3.调用 start 方法，开启新线程，执行 run 方法
        t.start();

        //简化：匿名内部类
        new Thread(new Runnable() {//省去创建 Runnable 接口的实现类对象
            @Override
            public void run() {//必须重写run方法（方法名、返回值、参数都要再写一遍），且不能写错
                System.out.println(Thread.currentThread().getName() + "（匿名内部类）");
            }
        }).start();//而实际上，似乎【方法体】才是关键所在

    }
}
