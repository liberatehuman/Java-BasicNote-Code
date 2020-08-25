package d03_EX;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.stream.Stream;

public class D02_Stream {

    public static void main(String[] args) {

        //人群1：
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张飞");
        list1.add("吴彦祖");
        list1.add("刘德华");
        list1.add("张学友");
        list1.add("张国荣");
        list1.add("张牙舞爪");

        //1.1过滤、1.2截取
        Stream<String> stream1 = list1.stream().filter((s) -> s.length() == 3).limit(3);

        //人群2：
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("刘雯");
        list2.add("林志玲");
        list2.add("刘诗诗");
        list2.add("刘若英");
        list2.add("刘嘉玲");
        list2.add("刘文文");

        //2.1过滤、2.2跳过
        Stream<String> stream2 = list2.stream().filter((s) -> s.startsWith("刘")).skip(2);

        //3.组合、4.映射（转换）、5.遍历
        Stream.concat(stream1, stream2).map((s) -> (new Person(s))).forEach((p) -> System.out.println(p));
    }

}
