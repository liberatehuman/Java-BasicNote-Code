package d12_List_Vector;
/*
* 【java.util.Vector<E>类】（了解）：JDK 1.0
*
*   ArrayList 和 LinkedList 的前身（所有单列集合的祖宗）
*
*  数据结构：【数组】
*
*  不同与 新Collection 成员，其实现是【同步】的，（单线程/线程安全，速度慢）
*
*【原主要方法】：
*  1、void addElement(E e)：添加指定组件到此向量末尾
*  2、Enumeration<E> elements()：返回此向量的组件的遍历（当时还没Iterator JDK 1.2）
*
*       接口 Enumeration<E>：早期的迭代器
*
*       方法：
*           boolean hasMoreElements()：判断是否由下一个元素（ => Iterator.hasNext() ）
*           E nextElement()：返回下一个元素（ => Iterator.next() ）
*
*  JDK 1.2+，Vector<E> implements List<E>
* */
public class Demo {
}
