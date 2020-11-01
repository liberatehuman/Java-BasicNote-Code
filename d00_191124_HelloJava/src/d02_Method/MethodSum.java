package d02_Method;

public class MethodSum {
    public static void main(String[] args) {
        System.out.println("1+2+...+100= " + getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
