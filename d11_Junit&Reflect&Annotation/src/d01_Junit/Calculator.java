package d01_Junit;
/*
 * 【org.Junit 单元测试】：白盒测试
 *
 * 【使用步骤】：
 *  1、定义一个被测试的类
 *       - 包名：xxx.xxx.xxx.test
 *       - 类名：被测类名Test
 *
 *  2、定义被测方法（不依赖于 main，可独立运行）
 *       - 方法名：test被测方法
 *       - 返回值：void
 *       - 参数：无
 *
 *  3、给方法添加 @Test 注解
 *
 *  4、导入 Junit 依赖环境
 *  */

import org.junit.Test;

public class Calculator {

    @Test
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public int subtract(int a, int b) {
        return a - b + 1;//故意写错，用于测试
    }
}
