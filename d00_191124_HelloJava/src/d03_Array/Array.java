package d03_Array;
/*
【数组】：一种容器，同时存放多个数据值

【特点】：
 1、是一种引用数据类型
 2、存放的数据类型必须一致
 3、数组长度在程序运行期间不可改变

 数组初始化：在内存中创建一个数组，并向其中赋予一些默认值
    1、动态初始化（指定长度）
    2、静态初始化（指定内容）

【动态初始化】数据格式：
    数据类型[] 数组名 = new 数组类型[长度]

【静态态初始化】数据格式：
    数据类型[] 数组名 = new 数组类型[]{元素1,元素2,...}
    数据类型[] 数组名 = {元素1,元素2,...}  //省略写法

【注】：
 1、静态初始化虽没有告诉长度，但根据{}内元素个数，可确定长度。数组都是有一定长度的
 2、=左右数据类型需一致
 3、动态、静态初始化的标准格式，可拆分为两步
 4、静态初始化的省略写法，不可拆分步骤

【建议】：若确定了数组内容，用静态；否则用动态
*/

public class Array {

    public static void main(String[] args) {

        //动态初始化
        int[] arrayA = new int[5];
        double[] arrayB = new double[5];
        String[] arrayC = new String[5];

        //静态初始化
        int[] a1 = new int[]{1, 2, 3};
        String[] a2 = new String[]{"Hello", "World", "Java"};

        //静态初始化省略写法
        int[] a3 = {4, 5, 6};

        //拆分写法
        int[] array1;
        array1 = new int[3];

        int[] array2;
        array2 = new int[]{6, 6, 6};

        /*静态省略写法不可拆，错误
        int[] c;
        c={0,0,0};
        */
    }
}