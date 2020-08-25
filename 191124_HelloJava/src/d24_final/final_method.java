package d24_final;
/*
final修饰【方法】：意味着该方法不能被覆写

格式：
修饰符 final 返回值类型 方法名(参数列表){ ... }

【注】：
1、对于类和方法，abstract和final关键字不可同时使用，因为矛盾（抽象无方法体必须要重写，final不能被重写）
*/

public class final_method {

    public final void finalMethod(){
        System.out.println("final方法");
    }
}
