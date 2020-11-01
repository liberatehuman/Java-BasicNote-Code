package d03_Array;

public class ArraySame {

    public static void main(String[] args) {

        int[] arrayA = new int[2];
        System.out.println(arrayA);
        arrayA[0] = arrayA[1] = 9;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println("————————————");

        int[] arrayB = new int[2];
        System.out.println(arrayB); //不同数组的地址不同
        System.out.println("————————————");

        int[] arrayC = arrayA; //将数组A的地址赋给数组C，即数组A和C指向同一地址的内容，也即数组A和C是一个数组
        System.out.println(arrayC);
        System.out.println(arrayC[0]);
        System.out.println(arrayC[1]);
        System.out.println("————————————");
    }
}
