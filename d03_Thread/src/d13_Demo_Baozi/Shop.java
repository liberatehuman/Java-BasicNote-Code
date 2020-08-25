package d13_Demo_Baozi;

public class Shop extends Thread {

    //店铺中的包子
    private Baozi bz;

    //含参构造：用于创建线程时给包子成员变量赋值
    public Shop(Baozi baozi) {
        this.bz = baozi;
    }

    @Override
    public void run() {

        int count = 0;

        while (true) {

            //店铺线程与顾客线程同时只能执行一个，必须使用同步技术
            synchronized (bz) {

                //【***等待***】
                // 1.店铺内有包子 --> 等待顾客吃
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //【主要线程任务】
                //2.店铺内没包子 --> 被顾客唤醒生产包子
                //设置包子种类
                if (count % 2 == 0) {//第一种包子
                    bz.pi = "薄皮";
                    bz.xian = "肉馅";
                } else {//第二种包子
                    bz.pi = "厚皮";
                    bz.xian = "菜馅";
                }
                count++;//交替生产2种不同包子

                //制作包子
                System.out.println("开始制作：*" + bz.pi + "*" + bz.xian + "*包子...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //制作完毕 --> 唤醒顾客
                bz.flag = true;//店铺内有包子

                //【***唤醒***】
                bz.notify();//唤醒顾客线程吃包子
                System.out.println("*" + bz.pi + "*" + bz.xian + "*包子已做好，顾客请享用");

            }


        }
    }
}
