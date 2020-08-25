package d12_List_LinkedList;

import java.util.LinkedList;

/*
 * 【java.util.LinkedList<E>类】implements List<E> ：包含大量操作首尾元素的方法（特有，不能多态）
 *
 *  数据结构（底层）：【链表】（查询慢，增删快）
 *
 *  增删快：实现是【不同步】的（多线程）
 *
 * 【常用方法】：
 *  1、public void addFirst(E e)：添加指定元素到列表开头
 *  2、public void push(E e)：等价于↑（将指定元素压入列表所表示的堆栈）
 *  3、public void addLast(E e)：添加指定元素到列表尾部（等价于add(E e)）
 *
 *  4、public E getFirst()：返回列表第一个元素
 *  5、public E getLast()：返回列表最后一个元素
 *
 *  6、public boolean isEmpty()：列表是否为空，是则返回true
 *
 *  7、public E removeFirst()：移除列表第一个元素
 *  8、public E pop()：等价于↑（将最后一个元素从列表所表示的堆栈中弹出）
 *  9、public E removeLast()：移除列表最后一个元素
 *
 *  */
public class Demo {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();//要用LinkedList特有方法，不多态
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //addFirst(push)、addLast
        linked.addFirst("w");
        linked.push("www");
        linked.addLast("com");// <==> add(E e)
        System.out.println(linked);

        //getFirst、getLast
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        //isEmpty（一般与remove相关方法搭配，防止 NoSuchElementException 异常）
        if (!linked.isEmpty()) {

            //removeFirst(pop)、removeLast
            System.out.println("被删首元素：" + linked.removeFirst());
            System.out.println("被删首元素：" + linked.pop());
            System.out.println("被删尾元素：" + linked.removeLast());
        }

        System.out.println(linked);

    }
}
