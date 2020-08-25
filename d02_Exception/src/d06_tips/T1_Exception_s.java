package d06_tips;

import java.util.List;

/*
* 【多异常 捕获处理】
*
* 1、多个异常：分别处理
*
* 2、多个异常：一次捕获，多次处理（注意【继承关系】，否则编译异常）
*
* 3、多个异常：一次捕获，一次处理
*
*       - 【运行异常】也可不处理（既不捕获，也不处理），交给 JVM 中断处理
* */
public class T1_Exception_s {

    public static void main(String[] args) {

        //1.分别处理
        try {
            int[] array={1,2,3};
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(4));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码1");

        //2.一个 try，多个 catch 处理
        //注意异常的继承关系：子类异常在前，父类异常在后
        //ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException extends Exception
        try {
            int[] array={1,2,3};
            System.out.println(array[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(4));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码2");

        //3.一个 try，一个 catch 处理
        try {
            int[] array={1,2,3};
            System.out.println(array[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(4));
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码3");

    }
}
