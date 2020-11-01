package d03_Array;

public class ArrayMax {

    public static void main(String[] args) {

        int[] array = {5, 10, 20, 40, 100, 2000, -1};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);
    }
}
