package d03_Array;

public class ArrayException {

    public static void main(String[] args) {

        //1.索引问题
        int[] arrayA = {1, 2, 3};
        //SystemDemo.out.println(arrayA[3]); //ArrayIndexOutOfBoundsException数组索引越界异常

        //2.空指针问题
        int[] arrayB = null; //所有引用类型变量（如数组）都可赋一个null值，但表示其中什么也没有
        //arrayB = new int[3]; //忘记new了。数组必须new初始化才能使用其中元素
        System.out.println(arrayB[0]); //NullPointerException空指针异常，只赋值null，没有new
    }
}
