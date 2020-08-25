package d06_tips;

/*
 * 【finally 中的 return 语句】
 *
 *       【避免】--> 若 finally 中有 return 语句，则【必然返回】finally 中的结果
 * */
public class T2_finally_return {

    public static void main(String[] args) {
        System.out.println(getA());
    }

    public static int getA() {

        int a = 10;

        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //必定执行的内容
            a = 99;
            return a;
        }
    }
}
