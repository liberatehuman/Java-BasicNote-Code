package d02_Method;
//【重载练习1】：判比较两个数是否相等。分别对两个byte，两个short，两个int，两个long

public class MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame(2, 2));
        System.out.println(isSame((byte) 1, (byte) 2));
        System.out.println(isSame((short) 1, (short) 2));
        long x = 10;
        long y = 20;
        System.out.println(isSame(x, y));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.print("比较两个byte结果：");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        boolean same;
        System.out.print("比较两个short结果：");
        return same = a == b ? true : false;
    }

    public static boolean isSame(int a, int b) {
        boolean same;
        System.out.print("比较两个int结果：");
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(long a, long b) {
        System.out.print("比较两个long结果：");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

}
