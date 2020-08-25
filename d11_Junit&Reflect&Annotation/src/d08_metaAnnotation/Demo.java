package d08_metaAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@MyAnnotation//作用于类
public class Demo {

    @MyAnnotation//作用于成员变量
    private String name;

    @MyAnnotation//作用于方法
    public void method() {
    }

}
