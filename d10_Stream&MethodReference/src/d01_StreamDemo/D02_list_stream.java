package d01_StreamDemo;
/*
* 【使用 stream流 实现过滤】：jdk 1.8+
*
* */
import java.util.List;

public class D02_list_stream {

    public static void main(String[] args) {

        List<String> list = List.of("张无忌", "周芷若", "张强", "张三丰");

        list.stream()
                .filter((s) -> s.length() == 3)//1.filter方法参数：Predicate接口实现判断条件1
                .filter((s) -> s.startsWith("张"))//2.filter方法参数：Predicate接口实现判断条件2
                .forEach((s) -> System.out.println(s));//3.forEach方法参数：Consumer接口实现使用
    }
}
