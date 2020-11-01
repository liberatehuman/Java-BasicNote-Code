package my.algorithms.Test;

import my.algorithms.linear.Stack;

public class Linear09_StackTest {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (Integer integer : stack) {
            System.out.println(integer);
        }
        System.out.println("===========");

        System.out.println("出栈元素：" + stack.pop());

        System.out.println("剩余元素个数：" + stack.size());
    }
}
