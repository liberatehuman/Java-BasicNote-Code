package d16_Map_Exercise;
/*
 * 【练习：输入字符串，用Map集合计算字符串中各字符出现次数】
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            //判断map集合是否包含该字符，是则次数+1
            if (map.containsKey(c)) {
                Integer n = map.get(c);
                n++;
                map.put(c, n);
            }
            //反之，也即首次添加
            else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
