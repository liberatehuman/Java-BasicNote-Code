package d07_myAnnotation;
/*
 * 【使用注解】：必须对属性进行赋值
 *
 * 【注】：
 *  1、若定义属性时，使用 default 关键字对属性已经赋值，则使用时可以不赋值
 *          int show() default 3;
 *
 *  2、若【仅一个属性需要赋值】，且属性名为 value，赋值时【value 可省】，直接赋值即可
 *          int value();
 *
 *  3、数组赋值时，需要用【{ }包裹】，若数组仅一个元素，{}可省
 * */

@MyAnnotation(
        intShow = 1,
        //stringShow = "a",//已 default 赋值，使用可以不赋值
        enumShow = Number.NUMBER1,
        annotationShow = @MyAnnotation2,//注解属性，用注解赋值

        ints = {1, 2, 3},//数组需要用{ }
        strings = "abc",//一个元素可省{ }
        enums = {Number.NUMBER1, Number.NUMBER2},
        annotations = {@MyAnnotation2, @MyAnnotation2})

@MyAnnotation3(5)//仅一个属性要赋值，且名为 value，value可省
public class Demo {
}
