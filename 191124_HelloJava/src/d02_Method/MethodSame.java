package d02_Method;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1, 2));
        System.out.println(isSame(2, 2));
    }

    public static boolean isSame(int a, int b) {
        //方式1
        /*boolean same1;
        if (public_a == protected_b) {
            same1 = true;
        } else {
            same1 = false;
        }
        return same1;*/

        //方式2
        /*boolean same2;
        same2 = public_a == protected_b ? true : false;
        return same2;*/

        //*方式3
        return a == b;

        //一个方法可以有多个return，但必须保证只有一个被执行！且return之间不能连写
    }
}
