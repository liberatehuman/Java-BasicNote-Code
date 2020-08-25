package d03_Supplier;
/*
 * 【练习】：求数组最大值（int[]）
 *
 * */

import java.util.function.Supplier;

public class EX {

    //获取接口泛型类型的方法
    public static int getMax(Supplier<Integer> integerSupplier) {
        return integerSupplier.get();
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5};

        int max = getMax(() -> {
            //重写 get 方法：遍历数组求最大
            int m = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (m < arr[i]) {
                    m = arr[i];
                }
            }
            return m;
        });

        System.out.println(max);
    }


}
