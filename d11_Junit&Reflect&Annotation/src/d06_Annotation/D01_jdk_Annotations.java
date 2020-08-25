package d06_Annotation;
/*
* 【jdk 预定义注解】：
*  1、@Override：检测被标注方法是否继承自父类/接口的
*
*  2、@Deprecated：被标注的方法表示已过时
*
*  3、@SuppressWarnings：压制警告（编辑器右侧不报警），参数一般设"all"
*  */
@SuppressWarnings("all")
public class D01_jdk_Annotations {

    //1.@Override
    @Override
    public String toString() {
        return super.toString();
    }

    //2.@Deprecated
    @Deprecated
    public static void show0(){
        System.out.println("已过时方法");
    }

    public static void main(String[] args) {
        show0();
    }

}
