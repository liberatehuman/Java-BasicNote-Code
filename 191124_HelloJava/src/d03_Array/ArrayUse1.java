package d03_Array;

//打印数组名，得到的是数组对应的：实际内存地址的【哈希值】（逻辑地址）

public class ArrayUse1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        //直接打印数组名，结果是内存地址哈希值
        System.out.println(array); //[I@3fee733d  [代表数组，I代表int类型，@后面是16进制

        //打印元素内容
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("————————");

        //也可以将元素赋值给变量，再打印
        int num = array[1];
        System.out.println(num);
    }
}
