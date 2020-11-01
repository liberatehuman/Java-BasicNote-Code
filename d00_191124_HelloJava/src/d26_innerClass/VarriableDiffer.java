package d26_innerClass;

/*
【外成员变量、内成员变量、内局部变量重名】

访问外成员变量：外部类名.this.外成员变量名
*/
public class VarriableDiffer {

    int num = 30; //外部类成员变量

    public class Inner {

        int num = 20; //内部类成员变量

        public void method() {

            int num = 10; //内部类局部变量

            System.out.println(num); //内局部变量10
            System.out.println(this.num); //内成员变量20
            System.out.println(VarriableDiffer.this.num); //访问外局部变量30
        }
    }
}
