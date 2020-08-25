package d10_synchronized_method_static;

/*
 * 【静态同步方法】：解决线程安全问题
 *
 * 【格式】：
 *      权限修饰符 static synchronized 返回值类型 方法名 (参) {
 *          可能出现线程安全问题的代码
 *      }
 *
 * 【注】：
 *      由于 this 是创建对象之后产生的，而静态方法优先于对象
 *      所有静态同步方法中的锁对象是【本类的.class 文件对象】（反射），不是this
 * */
public class RunnableImpl implements Runnable {

    private static int ticket = 100;//静态方法只能使用静态变量

    @Override
    public void run() {
        while (true) {
            sellTicket_static();
        }
    }

    //定义静态同步方法
    public static synchronized void sellTicket_static() {
        if (ticket > 0) {//静态方法只能访问静态变量（先人不知后人）
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->已出票:" + ticket);
            ticket--;
        }
    }

//    等价于
//    public static void sellTicket_static() {
//        synchronized (RunnableImpl.class) { //锁对象是实现类的.class文件对象（反射），不是this
//             ...
//        }
//    }

}
