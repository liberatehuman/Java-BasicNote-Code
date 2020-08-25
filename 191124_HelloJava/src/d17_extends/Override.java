package d17_extends;
/*
【重写】Override：方法名一样，参数列表【也一样】。（又称覆盖/覆写）

【重载】Overload：方法名一样，参数列表不同。

【重写注意】：
1、必须保证父子类方法的【名称】、【参数列表】均相同

        @Override：写在方法前面，用于检测覆写是否正确有效（可不写，但建议写上）
        （ @：annotation-注解。不是注释comment）

2、子类方法的返回值必须【小于等于】父类方法的返回值范围

        java.lang.【Object】是所有类的公共最高类（祖宗类），java.lang.String就是其子类之一

3、子类方法的权限修饰符必须【大于等于】父类方法的权限修饰符

        public > protected > 什么都不写 > private
*/
public class Override {

}
