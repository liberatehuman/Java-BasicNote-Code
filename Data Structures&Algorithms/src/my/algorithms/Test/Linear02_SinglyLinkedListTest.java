package my.algorithms.Test;

import my.algorithms.linear.SinglyLinkedList;

public class Linear02_SinglyLinkedListTest {
    public static void main(String[] args) {
        //创建单向链表对象
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        //测试插入
        singlyLinkedList.insert("迪丽热巴");
        singlyLinkedList.insert("古力娜扎");
        singlyLinkedList.insert("马尔扎哈");

        //测试遍历
        for (String s : singlyLinkedList) {//next方法返回泛型，否则只能Object
            System.out.println(s);//注意迭代器next更新结点，否则死循环
        }
        System.out.println("============");

        //测试获取
        String s1 = singlyLinkedList.get(0);//【头结点不计入】
        String s2 = singlyLinkedList.get(1);
        String s3 = singlyLinkedList.get(2);
        System.out.println("索引0处的元素：" + s1);
        System.out.println("索引1处的元素：" + s2);
        System.out.println("索引2处的元素：" + s3);
        //测试删除
        String s4 = singlyLinkedList.remove(2);
        System.out.println("被移除的元素：" + s4);
        //测试清空
        singlyLinkedList.clear();
        System.out.println("清空后元素个数：" + singlyLinkedList.length());
    }
}
