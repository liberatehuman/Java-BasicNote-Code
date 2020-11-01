package my.algorithms.unionFind;

/*【并查集】：高效查找合并的树型数据结构
 * */
public class UnionFind {

    private int[] elementsAndGroup;//每组结点元素作为分组标识
    private int groupCount;//分组个数

    public UnionFind(int n) {//构造方法：创建一个含 n 个分组的并查集
        this.groupCount = n;
        //将 elementsAndGroup 的索引视为结点元素，索引处的值视为分组标识
        this.elementsAndGroup = new int[n];
        for (int i = 0; i < n; i++) {
            elementsAndGroup[i] = i;//初始化情况下，i 索引处存储的值就是 i
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

    //获取元素 p 所在分组的标识 -【时间复杂度】O(1)
    public int findGroup(int p) {
        return elementsAndGroup[p];
    }

    //合并元素 p 和 q 所在的分组 - 【时间复杂度】O(N^2)
    public void union(int p, int q) {
        //1. 若 p q 已经在一组，直接返回
        if (isConnected(p, q)) {
            return;
        }
        //2. 若不同组，合并
        //先获取各自分组标识
        int groupP = findGroup(p);
        int groupQ = findGroup(q);
        //在 elementsAndGroup 中找到其中一个元素的分组标识，用另一元素的分组标识替换
        for (int i = 0; i < elementsAndGroup.length; i++) {
            if (elementsAndGroup[i] == groupP) {
                elementsAndGroup[i] = groupQ;
            }
        }
        groupCount--;
    }

}
