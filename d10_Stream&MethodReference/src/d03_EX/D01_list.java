package d03_EX;

import java.util.ArrayList;

public class D01_list {

    public static void main(String[] args) {

        //人群1：
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张飞");
        list1.add("吴彦祖");
        list1.add("刘德华");
        list1.add("张学友");
        list1.add("张国荣");
        list1.add("张牙舞爪");
        //1.1只要三个字名字，保存到新集合
        ArrayList<String> team1 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3) {
                team1.add(s);
            }
        }
        //1.2只取前3个，保存到新集合
        ArrayList<String> team1_final = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            team1_final.add(team1.get(i));
        }

        //人群2：
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("刘雯");
        list2.add("林志玲");
        list2.add("刘诗诗");
        list2.add("刘若英");
        list2.add("刘嘉玲");
        list2.add("刘文文");
        //2.1只要姓刘的
        ArrayList<String> team2 = new ArrayList<>();
        for (String s : list2) {
            if (s.startsWith("刘")) {
                team2.add(s);
            }
        }
        //2.2不要前2个
        ArrayList<String> team2_final = new ArrayList<>();
        for (int i = 2; i < team2.size(); i++) {
            team2_final.add(team2.get(i));
        }

        //3.两队保存到一个集合
        ArrayList<String> all = new ArrayList<>();
        all.addAll(team1_final);
        all.addAll(team2_final);

        //4.根据姓名创建Person对象，保存到Person类集合
        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        //5.遍历新集合
        for (Person person : list) {
            System.out.println(person);
        }
    }


}
