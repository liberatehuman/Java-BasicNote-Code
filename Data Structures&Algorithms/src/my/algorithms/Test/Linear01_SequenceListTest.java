package my.algorithms.Test;

import my.algorithms.linear.SequenceList;

public class Linear01_SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sequenceList = new SequenceList<>(3);
        //测试插入
        sequenceList.insert("迪丽热巴");
        sequenceList.insert("古力娜扎");
        sequenceList.insert("马尔扎哈");

        //测试遍历（实现了Iterable可以forEach）
        for (String s : sequenceList) {
            System.out.println(s);
        }
        System.out.println("============");

        //测试获取
        String s1 = sequenceList.get(1);
        System.out.println("索引1处的元素：" + s1);
        //测试删除
        String s2 = sequenceList.remove(2);
        System.out.println("被移除的元素：" + s2);
        //测试清空
        sequenceList.clear();
        System.out.println("清空后元素个数：" + sequenceList.length());

        System.out.println("============");

        //测试容量可变
        sequenceList.resize(4);
        sequenceList.insert("");
        sequenceList.insert("");
        sequenceList.insert("");
        sequenceList.insert("");
        sequenceList.insert("");//越界，会扩容两倍
        System.out.println("扩容后容量：" + sequenceList.getCapacity());//8

        sequenceList.remove(0);
        sequenceList.remove(0);
        sequenceList.remove(0);
        sequenceList.remove(0);
        System.out.println("缩容后容量" + sequenceList.getCapacity());//2
    }
}
