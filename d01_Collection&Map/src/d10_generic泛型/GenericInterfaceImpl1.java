package d10_generic泛型;

/* 【含泛型的接口】
 *
 * 【实现方法1】：实现类，实现指定泛型的接口
 *
 *      public interface Iterator<E> {
 *           E next();
 *      }
 *
 *      public final class Scanner implements Iterator<String> {
 *          public String next();//【实现过程直接确定数据类型】
 *      }
 *
 *   （Scanner类实现了Iterator接口，并指定泛型为String，故重写的next方法返回String类型）
 * */

public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println("实现1：" + s);
    }
}
