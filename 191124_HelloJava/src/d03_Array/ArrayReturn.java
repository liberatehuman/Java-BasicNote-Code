package d03_Array;

/*
【数组作为返回值】
*/

public class ArrayReturn {

    public static void main(String[] args) {
        int[] result = calculate(1, 2, 3); //用另一数组接收返回值（即array的地址值）
        System.out.println("求和：" + result[0]);
        System.out.println("求平均：" + result[1]);

        System.out.println("main接收到的返回值resul数组地址："+result);//两个数组地址相同
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg}; //可以直接将变量作为静态初始化数组元素，也可以array[0]=...,array[1]=...
        System.out.println("calculate方法内部数组地址："+array);
        return array; //返回值类型是数组，且返回的值是数组【地址值】
    }
}
