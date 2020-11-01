package d02_Method;

public class MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    public static void printCount(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Hello World!" + (j + 1));
        }
    }
}