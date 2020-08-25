package d03_Array;

/*
【数组可以作为方法的参数】

调用方法时，向括号内的数组进行传参，传递进去的其实是【地址值】
*/

public class ArrayParam {

    public static void main(String[] args) {
        int[] array = {6, 7, 8};

        arrayPrint(array); //调用方法，传参内容是数组的地址值
        System.out.println("——————");
        arrayPrint(array);
        System.out.println("——————");
        arrayPrint(array); //数组作为参数，便可多次调用，不用写多次for循环
    }

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
