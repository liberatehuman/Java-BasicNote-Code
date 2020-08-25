package d01_Exception;

/*【异常处理的原理】
 *
 * 1、JVM 检测异常
 *
 * 2、JVM 根据异常产生原因创建异常对象，该对象包括：内容、原因、位置
 *       new XxxException(...)
 *
 * 3、判断异常【所在方法】，是否有异常处理逻辑（try catch）
 *
 * 4、若无，JVM 则抛给异常所在方法的【调用者】，判断是否有处理
 *
 * 5、若无，JVM 则【自行接收】进行处理：
 *       1)在控制台红字打印异常对象(内容、原因、位置)
 *       2)中断处理（终端当前执行的java程序）
 *
 * */
public class Process {

    public static void main(String[] args) {//【2】抛给方法的调用者，也没有异常处理

        int[] array = {1, 2, 3};
        getElement(array, 3);//ArrayIndexOutOfBoundsException
    }

    public static int getElement(int[] arr, int index) {//【1】所在方法没有try catch处理
        int e = arr[index];
        return e;
    }

    //【3】抛给 JVM 处理：红字打印异常对象 + 中断处理(终止当前java程序)
}
