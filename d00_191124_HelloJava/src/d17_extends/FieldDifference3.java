package d17_extends;
/*
【三种变量重名】访问方法比较

        局部变量：       直接变量名

        本类成员变量：    this.变量名

        父类成员变量：    super.变量名
*/

public class FieldDifference3 {

    public static void main(String[] args) {

        Zi zi = new Zi();

        zi.varriableDiffer();
    }
}
