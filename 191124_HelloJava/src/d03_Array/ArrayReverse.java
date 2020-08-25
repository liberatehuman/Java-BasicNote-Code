package d03_Array;
/*
数组元素逆序输出，其实就是【对称位置】元素交换，然后遍历

对称元素交换需要两个索引，一头一尾，往中间靠

初始化语句：min=0，max=数组长度-1
终止条件：min==max（长度为奇数）/min>max（长度为偶数）
步进表达式：min++，max--

*/

public class ArrayReverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int t = array[min];
            array[min] = array[max];
            array[max] = t;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
