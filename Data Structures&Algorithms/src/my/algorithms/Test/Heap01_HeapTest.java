package my.algorithms.Test;

import my.algorithms.heap.Heap;

public class Heap01_HeapTest {
    public static void main(String[] args) {

        Heap<String> heap = new Heap<>(10);
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");

        //测试删除最大元素
        String result;
        while ((result = heap.deleteMax()) != null) {
            System.out.print(result + " ");//G F E D C B A
        }
    }
}
