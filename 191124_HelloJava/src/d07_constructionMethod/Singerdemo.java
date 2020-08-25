package d07_constructionMethod;

public class Singerdemo {

    public static void main(String[] args) {

        Singer singer = new Singer();
        singer.setName("鹿晗");
        singer.setAge(30);
        singer.setMale(true);

        System.out.println("歌手姓名：" + singer.getName());
        System.out.println("歌手年龄：" + singer.getAge());
        System.out.println("歌手性别为男？" + singer.isMale()); //注意boolean型的Getter方法是【isXxx】
    }
}
