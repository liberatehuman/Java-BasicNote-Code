package d06_Runnable;

//1. 创建 Runnable 接口的实现类
public class RunnableImpl implements Runnable {

    //2. 重写 run 方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }

}
