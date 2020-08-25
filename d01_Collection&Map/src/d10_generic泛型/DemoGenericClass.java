package d10_generic泛型;
/*
 * 【使用带泛型的类】
 *
 *       有了泛型，在创建不同对象的时候，需要什么类型就设为什么类型（不用时默认Object类型）
 * */

public class DemoGenericClass {

    public static void main(String[] args) {

        //存储为Integer类型
        GenericClass<Integer> g1 = new GenericClass<>();
        g1.setVar(666);
        System.out.println(g1.getVar());

        //存储为String类型
        GenericClass<String> g2 = new GenericClass<>();
        g2.setVar("ABC");
        System.out.println(g2.getVar());
    }

}
