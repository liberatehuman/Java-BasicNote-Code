package d26_innerClass;
/*【成员内部类】*/

public class MemberInner { //外部类

    public class Heart { //成员内部类

        public void beat() {
            System.out.println("内部类方法");

            System.out.println(num); //内用外，随意
        }

    }


    private int num = 10;

    public void move() {
        System.out.println("外部类方法");

        Heart heart = new Heart();
        heart.beat();
    }

}
