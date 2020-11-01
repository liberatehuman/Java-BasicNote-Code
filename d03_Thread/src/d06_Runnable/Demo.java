package d06_Runnable;

/*
 * 【实现多线程程序 -- 方式 2】：实现 Runnable 接口（推荐）
 *
 * 【java.lang.Runnable 接口】：应由那些打算通过某一线程执行其示例的类来实现，实现类必须定义一个无参 run 方法
 *
 * 【java.lang.Thread 类】构造方法：
 *       Thread(Runnable target)
 *       Thread(Runnable target, String name)
 *
 * 【实现步骤】：
 * 1、创建 Runnable 接口的实现类

 * 2、重写 run 方法
 *
 * 3、创建该实现类对象
 *
 * 4、创建 Thread 类对象，构造方法传参为Runnable实现类对象
 *
 * 5、调用 Thread 类的 start 方法开启新线程
 *
 * 【优点】：
 * 1、避免 Thread 类单继承的【局限性】
 *      继承 Thread 类，就不能继承其它的类；
 *      实现 Runnable 接口，还可以继承其它的类，可以实现其它接口
 *
 * 2、增加程序【扩展性】，降低程序【耦合性】（解耦）
 *      实现 Runnable 接口，将"线程任务设置"和"开启新线程"分离（解耦）
 *          - 重写 run 方法：用于设置线程任务
 *          - 创建 Thread 对象，调用 start 方法：开启新线程
 * */
public class Demo {

    public static void main(String[] args) {

        //3. 创建该实现类对象
        RunnableImpl mt = new RunnableImpl();

        //4. 创建 Thread 类对象，构造方法传参为Runnable实现类对象
        //Thread t = new Thread(mt);
        Thread t = new Thread(new RunnableImpl2());//【扩展性】创建对象时可传不同实现类（mt只是展示用）

        //5. 调用 Thread 类的 start 方法
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }
}
