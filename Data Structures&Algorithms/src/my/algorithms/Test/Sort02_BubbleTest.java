package my.algorithms.Test;

import my.algorithms.sort.Bubble;

import java.util.Arrays;

public class Sort02_BubbleTest {
    public static void main(String[] args) {

        //int[] array = new int[] {1, 2, 3};//基本类型 int 没有实现 Comparable

        Integer[] array = {1, 3, -1, 6, 0, 1};//Integer implements Comparable<Integer>

        Bubble.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
