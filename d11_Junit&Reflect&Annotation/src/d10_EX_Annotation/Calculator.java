package d10_EX_Annotation;

//计算器类（包含被检测的方法）
public class Calculator {
    @Check
    public void add() {
        System.out.println("1 + 0 = " + (1 + 0));
    }

    @Check
    public void subtract() {
        System.out.println("1 - 0 = " + (1 - 0));
    }

    @Check
    public void multiply() {
        System.out.println("1 * 0 = " + (1 * 0));
    }

    @Check
    public void divide() {
        System.out.println("1 / 0 = " + (1 / 0));
    }

    @Check
    public void nullString() {
        String s = null;
        System.out.println(s.toString());
    }
}
