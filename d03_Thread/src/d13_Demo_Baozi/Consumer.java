package d13_Demo_Baozi;

public class Consumer extends Thread {

    //顾客的包子
    private Baozi bz;

    //含参构造：用于创建线程时给包子成员变量赋值
    public Consumer(Baozi baozi) {
        this.bz = baozi;
    }

    @Override
    public void run() {
        while (true) {
            //店铺线程与顾客线程同时只能执行一个，必须使用同步技术
            synchronized (bz) {

                //【***等待***】
                //1.顾客没包子吃 --> 等待店铺生产
                if (bz.flag == false) {
                    try {
                        bz.wait();//等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //【主要线程任务】
                //2.顾客有包子吃 --> 被店铺唤醒吃包子
                System.out.println("顾客吃：" + bz.pi + "*" + bz.xian + "*包子");

                //顾客吃完包子 --> 唤醒店铺
                bz.flag = false;//顾客没包子吃

                //【***唤醒***】
                bz.notify();//唤醒店铺生产包子
                System.out.println("顾客吃完" + bz.pi + "*" + bz.xian + "*包子，店铺开始生产包子");
                System.out.println("-------------------------------------------------------------");
            }
        }
    }
}
