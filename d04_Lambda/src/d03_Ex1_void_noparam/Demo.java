package d03_Ex1_void_noparam;

/*
 * 【 Lambda 表达式  练习1】：无参、无返回值的接口方法
 *
 * */
public class Demo {

    public static void main(String[] args) {

        //1.匿名内部类方式
        invoke(new Chef() {
            @Override
            public void cook() {
                System.out.println("大厨料理中...");
            }
        });

        //2. Lambda 表达式
        invoke(() -> {
            System.out.println("大厨料理中...(Lambda)");
        });

    }


    //创建一个方法，参数为Chef接口对象，并调用其cook方法
    public static void invoke(Chef chef) {
        chef.cook();
    }

}
