package d11_Random;

//【Random类】：生成随机数

//使用也是三步骤：导包，创建，使用

//1.导包
import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        //2.创建
        Random rand = new Random();

        //3.使用
        //无参nextInt()方法包含所有Int类型（正负都有）
        int num = rand.nextInt();
        System.out.println("任意随机数：" + num);
        System.out.println("————————————————————————");

        //含参nextInt(x)范围[0,x)
        for (int i = 0; i < 10; i++) {
            System.out.println("[0,20)内随机数：" + rand.nextInt(20));
        }
    }
}
