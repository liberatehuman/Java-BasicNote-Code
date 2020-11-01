package d03_Array;
/*
动态初始化数组时，其元素自动产生【默认值】：
    整型：0
    浮点型：0.0
    字符型：'\u0000'，u是Unicode，0000是16进制
    布尔型：false
    引用类型：null

【注】：静态初始化也会产生默认值，只不过系统马上将默认值替换成了所设的具体元素
*/

public class ArrayUse2 {

    public static void main(String[] args) {

        int[] array = new int[3];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //可修改元素内容
        array[1] = 10;
        System.out.println(array[1]);
    }
}
