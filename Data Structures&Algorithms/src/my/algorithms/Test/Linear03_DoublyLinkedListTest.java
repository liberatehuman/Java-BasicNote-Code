package my.algorithms.Test;

import my.algorithms.linear.DoublyLinkedList;

public class Linear03_DoublyLinkedListTest {
    public static void main(String[] args) {

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        //测试插入
        doublyLinkedList.insert("迪丽热巴");
        doublyLinkedList.insert("古力娜扎");
        doublyLinkedList.insert("马尔扎哈");

        //测试首、尾元素
        String first = doublyLinkedList.getFirst();
        System.out.println("第一个元素：" + first);
        String last = doublyLinkedList.getLast();
        System.out.println("末尾元素：" + last);
        System.out.println("============");

        //测试遍历
        for (String s : doublyLinkedList) {//注意迭代器next更新结点，否则死循环
            System.out.println(s);
        }
        System.out.println("============");

        //测试获取
        String s1 = doublyLinkedList.get(0);//【头结点不计入】
        String s2 = doublyLinkedList.get(1);
        String s3 = doublyLinkedList.get(2);
        System.out.println("索引0处的元素：" + s1);
        System.out.println("索引1处的元素：" + s2);
        System.out.println("索引2处的元素：" + s3);
        //测试删除
        String s4 = doublyLinkedList.remove(1);//不能删最后一个元素，抛 NPE
        System.out.println("被移除的元素：" + s4);
        //测试清空
        doublyLinkedList.clear();
        System.out.println("清空后元素个数：" + doublyLinkedList.length());
    }
}
