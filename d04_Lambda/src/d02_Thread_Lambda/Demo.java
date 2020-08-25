package d02_Thread_Lambda;

/*
 * 【 Lambda 表达式】
 *
 * - 创建新线程，目的不是为了创建匿名内部类对象（只是过程），重点是要将 run 方法内的任务传递给 Thread 类知晓
 *
 * - 创建匿名内部类对象是受语言本身语法所限，Lambda 表达式可以抓住重点，回归本质
 *
 *       × new Runnable(){}    × @Override public void run
 *
 *       √ run方法体 () -> {...}
 *
 * 【标准格式】："一些参数 + 一个箭头 + 一段代码"
 *
 *       (参数列表) -> { 重写方法代码... }
 *
 *          () ：接口中抽象方法的参数列表
 *          {} ：重写接口抽象方法的方法体
 *          -> ：表示传递，将参数传递给方法体
 * */
public class Demo {

    public static void main(String[] args) {

        //匿名内部类实现多线程
        new Thread(new Runnable() {//非重点
            @Override
            public void run() {//非重点（本来就无返回值、无参数）
                System.out.println(Thread.currentThread().getName() + "（匿名内部类）");//重点
            }
        }).start();

        // Lambda 表达式实现多线程
        new Thread(() -> {//省去非重点过程
            System.out.println(Thread.currentThread().getName() + "（Lambda）");//保留重点
        }
        ).start();

    }

}
