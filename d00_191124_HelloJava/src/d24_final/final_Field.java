package d24_final;
/*
final修饰【成员变量】：同样表示不可变

【注】：
1、成员变量有【默认值】，final修饰必须手动赋值
2、可以对成员变量【直接赋值】或【在构造方法中间接赋值】，两者选其一，不可同时
*/
public class final_Field {

    private final int num/* = 10*/;

    public final_Field() {
        num=20; //在构造方法中赋值，需要把Setter方法去掉，否则矛盾
    }

    public final_Field(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

//    public void setNum(int num) {
//        this.num = num;
//    }

    public static void main(String[] args) {
        System.out.println(new final_Field().num);
    }
}
