package my.algorithms.Test;

/* 【栈】案例1：括号匹配问题
 *      给定一个字符串，检查该字符串的中的 "（ " 和 " ）" 是否成对出现
 *
 *  1.创建一个栈用来存储左括号
 *  2.从左往右遍历字符串，拿到每一个字符
 *  3.判断该字符是不是左括号，如果是，放入栈中存储
 *  4.判断该字符是不是右括号，如果不是，继续下一次循环
 *  5.如果该字符是右括号，则从栈中弹出一个（ 元素
 *  6.判断元素是否为null，如果不是，则证明有对应的左括号，如果不是，则证明没有对应的左括号
 *  7.循环结束后，判断栈中还有没有剩余的左括号，如果有，则不匹配，如果没有，则匹配
 * */

import my.algorithms.linear.Stack;

public class Linear10_BracketMatchTest {

    public static void main(String[] args) {
        String s = "(abc(d)e";
        System.out.println(isMatch(s));
    }

    public static boolean isMatch(String s) {
        //用于存放（ 的栈，等找到配对的 ）
        Stack<String> stack = new Stack<>();
        //遍历字符
        for (int i = 0; i < s.length(); i++) {

            String currentChar = s.charAt(i) + "";//获取当前字符，并转为字符串

            if (currentChar.equals("(")) {
                stack.push(currentChar);//（ 入栈
            } else if (currentChar.equals(")")) {
                String pop = stack.pop();// （ ）配对成功，（ 出栈
                if (pop == null) {
                    return false;//若为空，则无（
                }
            }
        }
        //遍历完毕，若栈内没有（，则说明数量匹配，反之则不匹配
        return stack.size() == 0;
    }
}
