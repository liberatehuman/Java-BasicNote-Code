package d07_myAnnotation;
/*
 * 【自定义注解】
 *
 * 【本质】：接口，默认【extends java.lang.annotation.Annotation 接口】（可通过 javad 指令对.class进行反编译查看）
 *
 * 【格式】：
 *       public @interface 注解名 {
 *           属性列表
 *       }
 *
 * 【属性】：接口中的抽象方法（使用注解需要传递属性，似成员变量）
 *
 * 【属性返回值类型】：
 *      1、基本类型
 *      2、String
 *      3、枚举类型（enum）
 *      4、注解
 *      5、以上类型的数组
 * */

public @interface MyAnnotation {
    //1.基本类型
    int intShow();

    //2.String
    String stringShow() default "a";

    //3.enum
    Number enumShow();

    //4.注解类型
    MyAnnotation2 annotationShow();

    //5.以上类型的数组
    int[] ints();

    String strings();

    Number[] enums();

    MyAnnotation2[] annotations();
}
