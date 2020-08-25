package d03_Array;
/*
获取数组长度： 数组名.length

【注】：数组一旦创建，程序运行期间，长度不会改变
*/

public class ArrayLength {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("数组长度为：" + array.length);

        array = new int[6];
        System.out.println("数组长度为：" + array.length);//6
        array = new int[3];
        System.out.println("数组长度为：" + array.length);//3
        //array只是一个名称，右边new出来的才是真正的数组
        //array所指方向变了，但是之前指向的数组没变，都是不同的数组，并不代表数组长度发生了变化

        //遍历数组
        int[] arrayB = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayB.length; i++) { //用数组长度作为循环长度，能根据实际数组改变灵活应变
            System.out.println(arrayB[i]);
        }
    }
}
