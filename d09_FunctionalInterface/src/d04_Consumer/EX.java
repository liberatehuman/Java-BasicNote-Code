package d04_Consumer;
/*
 * 【练习】：按【姓名：xx; 性别：x】，格式化打印字符串数组内容
 *
 *  要求：
 *       打印姓名的动作作为第一个Consumer接口的Lambda实例
 *       打印性别的动作作为第二个Consumer接口的Lambda实例
 * */

import java.util.function.Consumer;

public class EX {

    public static void method(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        //遍历内容
        for (String s : arr) {
            consumer1.andThen(consumer2).accept(s);//针对每个元素，组合并先后消费
        }
    }

    public static void main(String[] args) {

        String[] people = {"热巴，女", "娜扎，女", "扎哈，?"};

        method(people,
                (s) -> {//消费字符串：打印姓名
                    String name = s.split("，")[0];//分割，取姓名
                    System.out.print("姓名：" + name);
                },
                (s) -> {//消费字符串：打印性别
                    String sex = s.split("，")[1];
                    System.out.println("; 性别：" + sex);
                });
    }
}
