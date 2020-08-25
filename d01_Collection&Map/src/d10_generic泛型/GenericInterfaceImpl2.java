package d10_generic泛型;

/* 【含泛型的接口】

 * 【实现方法2】：实现类的泛型，跟着接口的泛型走（实现过程先用泛型，创建对象时确定数据类型）
 *
 *      public interface List<E> {
 *          boolean add(E e);
 *          E get(int index);
 *      }
 *
 *      public class ArrayList<E> implements List<E> {
 *          public boolean add(E e) {
 *              ...
 *          }
 *          public E get(int index) {
 *              ...
 *          }
 *
 *    - ArrayList实现了List接口，【泛型在创建对象时确定】
 * */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {

    @Override
    public void method(I i) {
        System.out.println("实现2：" + i);
    }
}
