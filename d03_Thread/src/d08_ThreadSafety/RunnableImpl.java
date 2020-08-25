package d08_ThreadSafety;

public class RunnableImpl implements Runnable {

    //多线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //卖票
        while (true) {
            if (ticket > 0) {

                //添加睡眠，提高出现重复的概率（CPU 使用权之后重新抢）
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
                ticket--;
            }
        }
    }

}
