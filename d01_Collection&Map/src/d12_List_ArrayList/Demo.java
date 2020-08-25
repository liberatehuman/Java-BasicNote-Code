package d12_List_ArrayList;
/*
* 【java.util.ArrayList<E>类】implements List<E>接口
*
*  数据结构（底层）：【数组】（查询快，增删慢）
*   Object[] elementData;
*
*  查询快：实现是不同步的（多线程）
*  增删慢：数组每次的增/删，底层都是经过元素的复制实现
*
*  public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
*       @SuppressWarnings("unchecked")
*       T[] copy = ((Object)newType == (Object)Object[].class)
*           ? (T[]) new Object[newLength]
*           : (T[]) Array.newInstance(newType.getComponentType(), newLength);
*       System.arraycopy(original, 0, copy, 0,
*                        Math.min(original.length, newLength));
*       return copy;
*  }
*
* 【结论】：
*       增删操作需求较多时，不宜用ArrayList
*       ArrayList最常用的场景：查询、遍历数据
* */

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();//看源码
    }
}
