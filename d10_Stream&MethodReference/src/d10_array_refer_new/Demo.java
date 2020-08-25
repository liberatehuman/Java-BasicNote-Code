package d10_array_refer_new;
/*
 * 【数组构造器（构造方法） 引用 new 】：要创建的数组类型，通过引用 new 进行创建
 *
 * 【前提】：
 *  1、【数组类型】是【已经存在的】（int[]）
 *
 *  2、 数组【长度】是【已知的】
 *
 *  3、【创建对象方式】也是【已经存在的】（new int[len]）
 * */

import java.util.Arrays;

public class Demo {

    public static int[] method(int length,ArrayBuilder arrayBuilder){
        return arrayBuilder.buildArray(length);
    }

    public static void main(String[] args) {

        //int[] array = method(5, (length) -> new int[length]);

        int[] array=method(5,int[]::new);//已知创建的是int[]，长度也是已知的，通过引用 new 进行创建

        System.out.println(Arrays.toString(array));
    }
}
