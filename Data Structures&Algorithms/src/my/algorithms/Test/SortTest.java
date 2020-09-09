package my.algorithms.Test;

import my.algorithms.sort.Insertion;
import my.algorithms.sort.Merge;
import my.algorithms.sort.Shell;

import java.io.*;
import java.util.ArrayList;

public class SortTest {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();//存放数据的集合
        //读取100000~1的逆序数据
        BufferedReader bf = new BufferedReader(new InputStreamReader(
                SortTest.class.getClassLoader().getResourceAsStream(
                        "reverse_array.txt")));//一定要放在src目录下
        String line;
        while ((line = bf.readLine()) != null) {
            list.add(Integer.valueOf(line));//字符串转整型，放入集合
        }

        Integer[] a = new Integer[list.size()];//数组
        list.toArray(a);//集合转数组

        //testShell(a);//65ms
        //testInsertion(a);//52016ms
        testMerge(a);//312ms
    }


    private static void testShell(Integer[] a) {
        long t0 = System.currentTimeMillis();
        Shell.sort(a);
        long t = System.currentTimeMillis();
        System.out.println("希尔排序耗时：" + (t - t0) + "ms");
    }

    private static void testInsertion(Integer[] a) {
        long t0 = System.currentTimeMillis();
        Insertion.sort(a);
        long t = System.currentTimeMillis();
        System.out.println("插入排序耗时：" + (t - t0) + "ms");
    }

    private static void testMerge(Integer[] a) {
        long t0 = System.currentTimeMillis();
        Merge.sort(a);
        long t = System.currentTimeMillis();
        System.out.println("归并排序耗时：" + (t - t0) + "ms");
    }
}
