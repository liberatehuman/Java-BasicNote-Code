package d05_sleep;

/*
 * 【常用方法 sleep】
 *
 *       public static void sleep(long millis)：使当前正在执行的线程暂停指定【毫秒数】时间，毫秒数结束后继续执行
 *
 *       继续执行后，多线程会重新抢夺 CPU 使用权
 * */
public class Demo {

    public static void main(String[] args) {

        //模拟计时器
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "秒");

            try {
                Thread.sleep(1000);//会编译异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
