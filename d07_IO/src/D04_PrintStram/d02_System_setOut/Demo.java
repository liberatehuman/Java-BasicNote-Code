package D04_PrintStram.d02_System_setOut;
/*
 * 【System.setOut 方法】：可改变输出语句的目的地（标准输出流在控制台打印）
 *
 *       - static void setOut(PrintStream ps)：重写分配标准输出流
 *
 *         参数：打印流目的地
 *
 * */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("控制台打印输出");//控制台

        PrintStream ps = new PrintStream("d07_IO//src//D04_PrintStram//b.txt");

        //改变标准输出流目的地
        System.setOut(ps);

        System.out.println("在b.txt中打印输出");//不在控制台打印，在b.txt中打印

        ps.close();
    }
}
