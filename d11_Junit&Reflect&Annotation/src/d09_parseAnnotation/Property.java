package d09_parseAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//作用于类上
@Retention(RetentionPolicy.RUNTIME)
public @interface Property {//自定义注解，属性包括配置的全类名、方法名

    String className();

    String methodName();
}
