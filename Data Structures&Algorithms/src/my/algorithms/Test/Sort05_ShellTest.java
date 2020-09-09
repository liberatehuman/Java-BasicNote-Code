package my.algorithms.Test;

import my.algorithms.sort.Insertion;
import my.algorithms.sort.Shell;

import java.util.Arrays;

public class Sort05_ShellTest {
    public static void main(String[] args) {

        Integer[] array = {6, 0, 2, 1, -1, 5};

        Shell.sort(array);

        System.out.println(Arrays.toString(array));
    }

}
