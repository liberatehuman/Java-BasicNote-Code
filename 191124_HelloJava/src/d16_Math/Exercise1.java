package d16_Math;

//【数学题】：在-10.8到5.9之间，绝对值大于6或小于2.1的整数有哪些？共多少个？

public class Exercise1 {

    public static void main(String[] args) {

        int counter = 0; //计数器初始化

        for (int i = (int) Math.ceil(-10.8); i <= (int) Math.floor(5.9); i++) {
            //Math.ceil和Math.floor的返回值是【double】类型，需【强制转换】为int

            if ((Math.abs(i) > 6) || (Math.abs(i) < 2.1)) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("共有：" + counter + "个");

    }
}
