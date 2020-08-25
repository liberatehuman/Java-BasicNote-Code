package d02_throw;

/*【关键字 throw 】：在指定方法中，抛出指定【异常对象】
 *
 *【格式】：
 *      throw new XxxException("异常原因");
 *
 *【注】：
 * 1、关键字 throw 必须写在【方法内部】
 * 2、关键字 throw 后面 new 的对象必须是【Exception 或其子类对象】
 * 3、根据情况处理异常
 *      1)new 的属于【编译异常】，必须处理（throws/try catch）
 *      2)new 的属于【RuntimeException】，可不处理，交给 JVM 处理（打印异常对象、中断程序）
 * */
public class Demo {

    public static void main(String[] args) {
        //int[] arr1 = null;
        //System.out.println(getE(arr1,0));//NullPointerException: 传递数组值为空（运行异常，给JVM）

        int[] arr2 = {1, 2, 3};
        System.out.println(getE(arr2, -1));//ArrayIndexOutOfBoundsException: 数组索引越界（JVM）
    }

    public static int getE(int[] arr, int index) {

        //一般对于方法的参数，首先需要进行【合法性校验】
        //若参数不合法，就必须通过抛出异常，来告知方法的调用者，参数有问题
        if (arr == null) {
            throw new NullPointerException("传递数组值为空");
        }
        if (index < 0 || index >= (arr.length - 1)) {
            throw new ArrayIndexOutOfBoundsException("数组索引越界");
        }

        int element = arr[index];

        return element;
    }
}
