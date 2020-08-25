package d02_Method;

/*
参数（原料）：进入方法的数据
方法体（工厂）：若干语句的功能集合
返回值（产出物）：从方法中产生的数据

定义方法的完整格式：
修饰符 返回值类型 方法名(参数类型 参数名,...){
    方法体
    return 返回值;
}

1、方法命名：小驼峰式
2、return两个作用：停止当前方法；将返回值还给调用处
【注】：返回值的类型应与定义时的返回值类型一致
*/
public class MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(2, 3);  //无结果
        //打印调用方式
        System.out.println(sum(2, 3)); //5
        //赋值调用方式
        int c = sum(2, 3);
        System.out.println(c);
        //【注】返回值类型为void时，只能单独调用
    }

    public static int sum(int a, int b) {
        int res = a + b;
        return res;
    }
}
/*
方法调用步骤：
1、找到方法
2、参数传递
3、执行方法体
4、带着返回值回到调用处
*/

