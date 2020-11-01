package my.algorithms.Test;

/*【案例】：畅通工程
 *      总共有 20 个城市，目前已修好 7 条道路，问还需要修建多少条道路，才能让这 20 个城市之间全部相通？
 *      还要修建（合并） 13-1 条
 * */

import my.algorithms.unionFind.UnionFindTreeWeighted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionFind04_TrafficProjectTest {
    public static void main(String[] args) throws IOException {

        //读取道路修建统计表
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                UnionFind04_TrafficProjectTest.class.getClassLoader().getResourceAsStream(
                        "traffic_project.txt")));

        //读取第一行数据：20
        int total = Integer.parseInt(bufferedReader.readLine());

        //构建并查集对象
        UnionFindTreeWeighted unionFindTreeWeighted = new UnionFindTreeWeighted(total);

        //读取第二行数据：7
        int roadNumber = Integer.parseInt(bufferedReader.readLine());

        //循环读取 7 条道路
        for (int i = 0; i < roadNumber; i++) {
            String line = bufferedReader.readLine();//"0 1"
            String[] split = line.split(" ");//{"0","1"}
            int p = Integer.parseInt(split[0]);//p = 0
            int q = Integer.parseInt(split[1]);//q = 1

            //调用合并方法（修路），让两个城市相通
            unionFindTreeWeighted.union(p, q);
        }

        //还需修建的数目
        System.out.println("待修道路个数：" + (unionFindTreeWeighted.getGroupCounts() - 1));// 12
    }
}
