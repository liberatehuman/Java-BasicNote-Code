package d10_generic泛型;

/*
 * 【使用泛型的类】定义格式：
 *
 *   public class 类名<E> {
 *
 *       private E 变量名
 *       ....
 *   }
 *
 * */
public class GenericClass<E> {

    private E var;

    public E getVar() {
        return var;
    }

    public void setVar(E var) {
        this.var = var;
    }
}
