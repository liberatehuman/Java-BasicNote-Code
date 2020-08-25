package d04_Recursion;

/*
 * 【递归】
 *
 * 【分类】：
 *  1、直接递归：方法自身调用自己
 *       a() {
 *           a();
 *       }
 *
 *  2、间接递归：A调B，B调C，C调A
 *       b() {
 *           c();
 *       }
 *
 *       c() {
 *           b();
 *       }
 *
 * 【使用场景】：多次调用一个方法时，方法主体不变，仅参数改变，可以使用递归
 *
 * 【注】：
 *  1、递归必须有【限定停止条件】，保证会停，否则导致栈内存溢出 StackOverflowError
 *
 *  2、有了停止条件，【次数不能太多】，否则也会导致栈内存溢出
 *
 *  3、【构造方法禁止】递归（构造方法是用于创建对象的，一直递归会创建无数对象【编译异常】）
 * */
public class Demo {

    public static void main(String[] args) {

        //a();//无终止条件，抛异常：java.lang.StackOverflowError

        b(1);//次数太多，到5500左右为止，同样 StackOverflowError
    }


    public static void a() {
        System.out.println("a方法");
        a();
    }


    public static void b(int i) {
        System.out.println("b方法：" + i);
        if (i == 10000) {
            return;//返回空，即停止方法
        }
        b(++i);
    }

    public Demo() {
        //D01_sum();//构造方法禁止递归
    }
}
