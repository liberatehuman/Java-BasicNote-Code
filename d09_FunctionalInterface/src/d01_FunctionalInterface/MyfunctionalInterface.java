package d01_FunctionalInterface;

/*
 * 【FunctionalInterface 函数式接口】：有且仅有一个抽象方法的接口
 *
 *      - 也可包括其他类型的方法（静态、默认、私有）
 *
 *  ------------------------------
 * 【 @FunctionalInterface 注解】：检测接口是否为函数式接口
 *
 *      - 只有抽象方法个数为 1 时，编译成功，否则编译报错
 *
 * */

@FunctionalInterface//注解
public interface MyfunctionalInterface {
    void method();
}
