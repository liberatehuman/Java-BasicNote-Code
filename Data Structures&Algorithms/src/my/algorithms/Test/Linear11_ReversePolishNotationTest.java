package my.algorithms.Test;

/* 【栈】案例2：逆波兰表达式（运算符总是放在与之相关的操作数之后）
 *
 *  1.创建一个栈对象oprands存储操作数
 *  2.从左往右遍历逆波兰表达式，得到每一个字符串
 *  3.判断该字符串是不是运算符，如果不是，把该该操作数压入oprands栈中
 *  4.如果是运算符，则从oprands栈中弹出两个操作数o1,o2
 *  5.使用该运算符计算o1和o2，得到结果result
 *  6.把该结果压入oprands栈中
 *  7.遍历结束后，拿出栈中最终的结果返回
 *  */

import my.algorithms.linear.Stack;

public class Linear11_ReversePolishNotationTest {

    public static void main(String[] args) {
        //中缀表达式 3*(17-15)+18/6 对应的逆波兰表达式：
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        System.out.println(calculate(notation));//9
    }

    public static int calculate(String[] notation) {
        //用于存放操作数的栈
        Stack<Integer> stack = new Stack<>();
        //遍历每个字符
        for (int i = 0; i < notation.length; i++) {
            String current = notation[i];

            Integer i1;
            Integer i2;
            Integer temp;//中间结果
            //判断是否为操作符
            switch (current) {
                case "+"://若操作符是+
                    i1 = stack.pop();//
                    i2 = stack.pop();//弹栈两个元素
                    temp = i1 + i2;//进行运算
                    stack.push(temp);//结果入栈
                    break;
                case "-":
                    i1 = stack.pop();
                    i2 = stack.pop();
                    temp = i2 - i1;
                    stack.push(temp);
                    break;
                case "*":
                    i1 = stack.pop();
                    i2 = stack.pop();
                    temp = i2 * i1;
                    stack.push(temp);
                    break;
                case "/":
                    i1 = stack.pop();
                    i2 = stack.pop();
                    temp = i2 / i1;
                    stack.push(temp);
                    break;
                default:
                    stack.push(Integer.parseInt(current));//不是操作符，就默认把操作数压栈
            }
        }
        Integer result = stack.pop();//遍历完毕，弹栈最终结果
        return result;
    }
}
