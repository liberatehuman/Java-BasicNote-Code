package my.algorithms.Test;

/* 【并查集 - 树优化测试】：同上
 * */

import my.algorithms.unionFind.UnionFindTree;

import java.util.Scanner;

public class UnionFind02_UnionFindTreeTest {
    public static void main(String[] args) {

        UnionFindTree unionFind = new UnionFindTree(5);//初始：5 个分组（0 1 2 3 4）

        Scanner scanner = new Scanner(System.in);

        while (true) {
            //输入两个元素（即分组索引）
            System.out.print("第一个元素：");
            int p = scanner.nextInt();
            System.out.print("第二个元素：");
            int q = scanner.nextInt();

            //判断是否一组，不是则合并
            if (unionFind.isConnected(p, q)) {
                System.out.println(p + "和" + q + "已合并为一组");
            }
            System.out.println("合并...");
            unionFind.union(p, q);

            //查看分组个数
            System.out.println("剩余分组个数：" + unionFind.getGroupCounts());
            System.out.println("============");

            if (unionFind.getGroupCounts() == 1) {
                System.out.println("已合并至最小1组");
                break;
            }
        }

    }
}
