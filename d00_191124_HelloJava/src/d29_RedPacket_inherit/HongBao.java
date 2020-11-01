package d29_RedPacket_inherit;

import java.util.ArrayList;

public class HongBao {

    public static void main(String[] args) {

        Leader leader = new Leader("领导", 10000);
        Member m1 = new Member("成员1", 0);
        Member m2 = new Member("成员2", 0);
        Member m3 = new Member("成员3", 0);

        leader.show();
        m1.show();
        m2.show();
        m3.show();

        System.out.println("——————发红包了！——————");
        ArrayList<Integer> redlist = leader.send(5000, 3);
        //领导的send方法返回值类型是ArrayList，所以可以直接赋值给新创建的空ArrayList
        m1.receive(redlist);
        m2.receive(redlist);
        m3.receive(redlist);

        m1.show();
        m2.show();
        m3.show();
        leader.show();

    }
}
