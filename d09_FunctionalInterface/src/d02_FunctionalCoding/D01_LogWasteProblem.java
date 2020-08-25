package d02_FunctionalCoding;
/*
 * 【日志性能浪费问题】：
 * */

public class D01_LogWasteProblem {

    public static void main(String[] args) {

        String message1 = "Hello";
        String message2 = "World";
        String message3 = "Java";

        showLog(1, message1 + message2 + message3);
        //【先】拼接字符串，【再】调用showLog
        // 若等级非1，则白白拼接，浪费资源
    }


    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }
}
