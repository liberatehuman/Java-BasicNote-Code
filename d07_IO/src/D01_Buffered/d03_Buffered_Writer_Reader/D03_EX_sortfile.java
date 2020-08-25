package D01_Buffered.d03_Buffered_Writer_Reader;
/*
 * 【字符缓冲流 练习：给文本内容排序】：按每行的序号排序
 *
 *      读源文件每行 -->（分割序号和内容 --> 分别作为 key 和 value 存入HashMap）--> 写入新文件
 *
 * 【分析】：
 *  1、使用 字符缓冲输入流 读取源文件每行
 *
 *  2、调用 String 的 split 方法，分割每行的序号和内容（为字符串数组元素），分别作为 key 和 value
 *
 *  3、利用 HashMap 集合保存每行内容（key是有序的1,2,3...）
 *
 *  4、使用 字符缓冲输出流 把集合内容写入目的地文件中
 * */

import java.io.*;
import java.util.HashMap;

public class D03_EX_sortfile {

    public static void main(String[] args) throws IOException {

        //创建字符缓冲流，明确源文件、目的地
        BufferedReader br = new BufferedReader(new FileReader(
                "d07_IO//src//D01_Buffered//c.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "d07_IO//src//D01_Buffered//c_sort.txt"));

        //用于保存每行序号和内容的集合
        HashMap<String, String> map = new HashMap<>();

        //行内容
        String line;

        //读取源文件每行
        while ((line = br.readLine()) != null) {
            String[] arrKV = line.split("\\.");//以序号和内容之间的"."分割为数组元素（注意加\\）
            map.put(arrKV[0], arrKV[1]);//保存到集合
        }

        //遍历key集合
        for (String key : map.keySet()) {
            String value = map.get(key);//根据key获取value
            line = key + "." + value;//定义新的行内容
            bw.write(line);//写入目的地
            bw.newLine();//【换行分隔符】（因为 readLine 不读取换行符）
        }

        //释放资源
        bw.close();
        br.close();
    }
}
