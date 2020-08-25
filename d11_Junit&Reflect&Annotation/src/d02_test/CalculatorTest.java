package d02_test;
/*
* 【测试方法】：针对被测类被测方法
*
*       - 同样需要添加 @Test 注解，才能测试（各自单独执行）
*       - 不用打印输出看结果（打印结果也许不报异常，但可能与期望不符）
*  ---------
* 【补充】：
*       @Before：被修饰方法会在测试方法之前自动执行（一般用于资源申请）
*
*       @After：被修饰方法会在测试方法执行后自动执行（一般用于资源释放）
* */
import d01_Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        //【断言】：断言结果为 3，实际结果为 result
        Assert.assertEquals(3, result);//断言正确（绿色）
        System.out.println("testAdd完成");//会执行
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        //断言
        Assert.assertEquals(-1, result);//java.lang.AssertionError: Expected :-1  Actual :0
        System.out.println("testSubtract完成");//不会执行
    }
}
