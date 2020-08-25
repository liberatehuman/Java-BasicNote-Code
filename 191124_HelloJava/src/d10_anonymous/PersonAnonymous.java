package d10_anonymous;
/*
创建对象标准格式：
    类名 对象名 = new 类名();

【匿名对象】：无左边的名字和赋值符，只有等号右边
1、匿名对象只是用一次，下次使用需要重新创建
2、要是有些对象只想用一次，不必取名字，就可以使用匿名对象
*/

public class PersonAnonymous {

    public static void main(String[] args) {

        new Person().name = "迪丽热巴"; //匿名对象使用完毕了
        new Person().show(); //name为null，因为匿名对象只使用一次
    }
}
