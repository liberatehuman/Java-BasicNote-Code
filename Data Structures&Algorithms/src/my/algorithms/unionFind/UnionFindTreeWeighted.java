package my.algorithms.unionFind;

/*【并查集 - 优化 - 再优化】；路径压缩
 * */
public class UnionFindTreeWeighted {

    private int[] elementsAndGroups;//索引是结点元素，值是每组元素的父结点
    private int groupCount;//分组个数
    private int[] elementCounts;//存储每个根结点所在树的元素个数

    public UnionFindTreeWeighted(int n) {//构造方法：创建一个含 n 个分组的并查集
        this.groupCount = n;
        //将 elementsAndGroups 的索引视为结点元素，索引处的值视为分组标识
        this.elementsAndGroups = new int[n];
        for (int i = 0; i < n; i++) {
            elementsAndGroups[i] = i;//初始化情况下，i 索引处存储的值就是 i
        }
        //初始情况，每个根结点所在树都只有一个元素
        this.elementCounts = new int[n];
        for (int i = 0; i < elementCounts.length; i++) {
            elementCounts[i] = 1;
        }
    }

    //获取并查集中分组个数
    public int getGroupCounts() {
        return groupCount;
    }

    //判断元素 p 和 q 是否在同一分组
    public boolean isConnected(int p, int q) {
        return findGroup(p) == findGroup(q);
    }

    //【获取元素 p 所在分组的标识】-【时间复杂度】O(N)
    public int findGroup(int p) {
        while (true) {
            if (elementsAndGroups[p] == p) {//若父结点就是本身，说明已到根结点，即本组标识
                return p;
            }
            p = elementsAndGroups[p];//继续找父结点
        }
    }

    //【合并元素 p 和 q 所在的分组】-【时间复杂度】O(1)
    public void union(int p, int q) {
        //1. 获取各自所在树的根结点
        int rootP = findGroup(p);
        int rootQ = findGroup(q);

        if (rootP == rootQ) {//2. 若已经同组，无需合并
            return;
        }
        //3. 若不在同一个分组，合并
        //比较 p 和 q 所在树的元素个数，【把较小的树合并到较大的树上】
        if (elementCounts[p] < elementCounts[q]) {
            elementsAndGroups[p] = rootQ;
            elementCounts[p] += elementCounts[q];//更新较大树的元素个数
        } else {
            elementsAndGroups[q] = rootP;
            elementCounts[q] += elementCounts[p];
        }

        groupCount--;
    }

}
