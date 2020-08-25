package d13_Set_HashSet;

/*
 * 【HashCode】哈希值：【十进制int】【逻辑地址值】，由系统随机给出（不是数据实际存储的物理地址）
 *
 * Object类中有【获取对象哈希值】的方法：
 *
 *      public native int hashCode();
 *
 *      -【native】：表示调用的是本地操作系统的方法
 * */
public class HashCode {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();

        int hc1 = obj1.hashCode();
        int hc2 = obj2.hashCode();

        System.out.println(hc1);//1072591677
        System.out.println(hc2);//1523554304

        //Object 类的 toString 方法，实际上就利用了哈希值：
        //源码:public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        System.out.println(obj1);//java.lang.Object@3fee733d
        System.out.println(obj2);//java.lang.Object@5acf9800
        System.out.println(obj1 == obj2);//false，实际物理地址不同

        //String类重写了hashCode方法：相同内容的哈希值相同
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println(s1.hashCode() == s2.hashCode());//true

        //【特】
        String s3 = "重地";
        String s4 = "通话";
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395（哈希值相同的不同元素：哈希冲突）
        System.out.println(s3.hashCode() == s4.hashCode());//true
    }
}
