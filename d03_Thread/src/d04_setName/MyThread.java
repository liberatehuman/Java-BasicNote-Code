package d04_setName;

public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


    public MyThread() {
    }

    //创建含参构造方法，参数为设置线程名
    public MyThread(String name) {
        super(name);//调用父类(Thread)含参构造方法，将线程名传参给父类，让父类给子线程起名
    }

}
