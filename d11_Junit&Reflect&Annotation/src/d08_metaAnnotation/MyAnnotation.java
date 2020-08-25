package d08_metaAnnotation;
/*
 * 【元注解】：描述注解的注解
 *
 * 【主要元注解】：
 *  1、@Target：描述注解能够作用的位置
 *
 *       - 属性：ElementType[] value();//enum ElementType 枚举类型
 *       - 取值：TYPE（作用在类上）,FIELD（作用在成员变量上）,METHOD（作用在方法上）
 *
 *  2、@Retention：描述注解被保留的阶段（三个阶段）
 *
 *       - 属性：RetentionPolicy value();enum RetentionPolicy
 *       - 取值：SOURCE, CLASS,【RUNTIME】（会被保留到.class字节码文件，并被 JVM 读取到，一般自定义注解用）
 *
 *  3、@Documented：描述注解是否被抽取到 API 文档中
 *
 *  4、@Inherited：描述注解是否被子类继承
 * */

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
}
