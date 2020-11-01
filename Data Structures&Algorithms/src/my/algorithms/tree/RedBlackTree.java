package my.algorithms.tree;

public class RedBlackTree<K extends Comparable<K>, V> {

    private Node root;
    private static final boolean RED = true;//红色（增加可读性，Node.color只能t/f）
    private static final boolean BLACK = false;//黑色
    public int n;

    private class Node {
        public K key;
        private V value;
        public Node left;
        public Node right;
        public boolean color;//结点颜色：true = 红，false = 黑

        public Node(K key, V value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

    //判断结点是否为红色
    private boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }

    //【左旋】
    private Node rotateLeft(Node h) {//h：当前结点，x：红色右子结点
        Node x = h.right;//标记红色右子结点为 x
        //1. 让 x 的左子结点成为 h 右子结点
        h.right = x.left;
        //2. 让 h 成为 x 左子结点
        x.left = h;
        //3. 让 x 结点颜色变为 h 结点颜色
        x.color = h.color;
        //4. 让 h 变为红色
        h.color = RED;
        return x;//返回 x 结点（在原当前结点位置）
    }

    //【右旋】
    private Node rotateRight(Node h) {
        Node x = h.left;//标记红色左子结点为 x
        //1. 让 x 的右子结点成为 h 的左子结点
        h.left = x.right;
        //2. 让 h 成为 x 的右子结点
        x.right = h;
        //3. 让 x 结点颜色变为 h 结点颜色
        x.color = h.color;
        //4. 让 h 变为红色
        h.color = RED;
        return x;//返回 x 结点（在原当前结点位置）
    }

    //【颜色反转】
    private void flipColor(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    //【插入】
    public void put(K key, V value) {
        root = put(root, key, value);
        root.color = BLACK;//每次插入完都令根结点为黑色
    }

    private Node put(Node h, K key, V value) {
        if (h == null) {//若结点为空，则返回一个新的红色结点
            n++;
            return new Node(key, value, null, null, RED);
        }
        //与当前结点键比较
        if (key.compareTo(h.key) < 0) {
            h.left = put(h.left, key, value);
        } else if (key.compareTo(h.key) > 0) {
            h.right = put(h.right, key, value);
        } else {
            h.value = value;
        }
        //保持树的平衡
        if (!isRed(h.left) && isRed(h.right)) {//当左子结点为黑，右子结点为红：左旋
            h = rotateLeft(h);
        } else if (isRed(h.left.left)) {//当左子结点的左子结点为红：右旋
            h = rotateRight(h);
        } else if (isRed(h.left) && isRed(h.right)) {//当左右子结点都为红：颜色反转
            flipColor(h);
        }
        return h;
    }

    //获取（同二叉查找树）
    public V get(K key) {
        return get(root, key);
    }

    private V get(Node h, K key) {
        if (h == null) {
            return null;
        }
        if (key.compareTo(h.key) < 0) {
            return get(h.left, key);
        } else if (key.compareTo(h.key) > 0) {
            return get(h.right, key);
        } else {
            return h.value;
        }
    }

    public int size() {
        return n;
    }

}
