package d05_System;
/*
【System.arraycopy】

        public static native void arraycopy(
            Object src：源数组 ,
            int srcPos：源数组起始位置 ,
            Object dest：目标数组 ,
            int destPos：目标组起始位置 ,
            int length：要复制的元素数量
            );
 -----------------
【2.将源数组的某些元素复制到目标组的指定位置】

    将dest[5,4,3,2,1]的前2个元素，复制到src[1,2,3,4,5]前2个位置
*/

import java.util.Arrays;

public class Exercise2_arraycopy {

    public static void main(String[] args) {

        int[] src={5,4,3,2,1};

        int[] dest={1,2,3,4,5};

        System.arraycopy(src,0,dest,0,2);

        System.out.println(Arrays.toString(dest));//数组是引用类型，直接打印是地址值需要toString
    }
}
