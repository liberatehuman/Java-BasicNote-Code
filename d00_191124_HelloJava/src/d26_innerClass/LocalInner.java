package d26_innerClass;
/*【局部内部类】*/

public class LocalInner {

    public void method() {

        //局部内部类使用所在方法的局部变量，局部变量必须【有效final】：
        /*final*/ int final_a = 5; //Java8+：只要局部变量【事实不变】，final可省
        //（因为局部变量类和局部变量的【生命周期】不同：
        //  类在【堆】中直到GC消失；变量在【栈】中随方法使用完消失）

        class Inner { //局部内部类，在方法内使用（无权限修饰）
            int num = 5;

            public void localm() {
                System.out.println(num);

                System.out.println(final_a); //局部内部类只要不变的数值，【无谓变量死活】
            }
        }

        Inner local = new Inner(); //在方法内实例化、使用
        local.localm();
    }

}
