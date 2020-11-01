package my.algorithms.tree;

import my.algorithms.linear.Queue;

public class BinaryTree<K extends Comparable<K>, V> {

    private Node root;//根结点
    private int n;

    private class Node {//一个结点也是一棵树
        private K key;
        private V value;
        private Node left;//指向左子结点的指针
        private Node right;//指向右子结点的指针

        private Node(K key, V value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

//    public BinaryTree() {//后面有考虑树为空的情况，不写构造方法，否则抛NPE
//        this.root = new Node(null, null, null, null);
//        this.n = 0;
//    }

    //【插入】
    public void put(K key, V value) {
        root = put(root, key, value);//参数是从整棵树的根结点开始，返回的是更新后的整棵树
    }

    private Node put(Node node, K key, V value) {//在指定树插入该键值对，并返回更新后的树
        //1) 若树为空，新结点作为根结点（递归终止条件）
        if (node == null) {
//            Node newNode = ;
            n++;
            return new Node(key, value, null, null);
        }
        //2) 若有结点，从该结点开始（视为根结点）
        // 比较根结点与待插结点键的大小，决定放入左/右子树
        if (key.compareTo(node.key) > 0) {//若待插键大，则继续往右找
            node.right = put(node.right, key, value);//更新右子结点
        }
        //【***区别 else if 和 if：前者与if是互补，而两个if是依次执行】
        else if (key.compareTo(node.key) < 0) {//若待插键小，则继续往左找
            node.left = put(node.left, key, value);//更新左子结点
        } else {
            node.value = value;//若键已存在，更新值
        }
        return node;
    }

    //【获取】
    public V get(K key) {
        return get(root, key);//从整棵树的根结点开始，找key
    }

    private V get(Node node, K key) {//在指定树找key
        //1) 若树为空
        if (node == null) {//（终止条件）
            return null;
        }
        //2) 若有结点，从该结点开始（视为根结点）
        // 比较键的大小，决定往左/右子树找
        if (key.compareTo(node.key) > 0) {
            return get(node.right, key);//继续往右子树找
        } else if (key.compareTo(node.key) < 0) {
            return get(node.left, key);//继续往左子树找
        } else {//找到键
            return node.value;
        }
    }

    //【删除】
    public void delete(K key) {//删除树中key对应的value
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {//删除指定树中key对应结点，并返回更新后的树
        //1. 找键
        //若树为空
        if (node == null) {
            return null;
        }
        //若有结点，从该结点开始
        if (key.compareTo(node.key) > 0) {
            node.right = delete(node.right, key);
        } else if (key.compareTo(node.key) < 0) {
            node.left = delete(node.left, key);
        } else {//2. 找到键，删除 node，并进行衔接
            n--;
            //3. 找右子树的最小结点，替换被删结点位置
            if (node.right == null) {
                return node.left;//若该结点没右子树，返回左子树
            }
            if (node.left == null) {
                return node.right;//若该结点没左子树，返回右子树
            }
            //（找右子树的最小结点替换）
            Node minNode = node.right;//右子树开始
            while (minNode.left != null) {//往左找
                minNode = minNode.left;//一直找
            }
            //3.1 先删除右子树最小结点（基本同上）
            Node temp = node.right;//右子树开始
            while (temp.left != null) {//往左找
                if (temp.left.left == null) {//当结点的左子树的左子树为空，表明找到最小结点
                    temp.left = null;//删除最小结点
                } else {
                    temp = temp.left;//一直找
                }
            }
            //3.2 最小结点替换被删位置
            minNode.left = node.left;//被删结点左子树成为最小结点左子树
            minNode.right = node.right;//被删结点右子树成为最小结点右子树
            node = minNode;//【被删结点的父结点】指向最小结点
        }
        return node;//返回更新后的树
    }

    //【查找最小的键】
    public K minKey() {
        return minKey(root).key;
    }

    private Node minKey(Node node) {//查找最小键所在的结点,并返回
        if (node.left != null) {
            return minKey(node.left);
        } else {
            return node;
        }
    }

    //【查找最大的键】
    public K maxKey() {
        return maxKey(root).key;
    }

    private Node maxKey(Node node) {//查找最大键所在的结点,并返回
        if (node.right != null) {
            return maxKey(node.right);
        } else {
            return node;
        }
    }

    //【前序遍历】
    public Queue<K> preErgodic() {
        Queue<K> queue = new Queue<>();
        preErgodic(root, queue);
        return queue;
    }

    private void preErgodic(Node node, Queue<K> keys) {
        if (node == null) {
            return;
        }
        keys.enqueue(node.key);//当前结点key放入队列
        if (node.left != null) {//若左子树不为空，递归遍历左子树
            preErgodic(node.left, keys);
        }
        if (node.right != null) {//若右子树不为空，递归遍历左子树
            preErgodic(node.right, keys);
        }
    }

    //【中序遍历】
    public Queue<K> midErgodic() {
        Queue<K> queue = new Queue<>();
        midErgodic(root, queue);
        return queue;
    }

    private void midErgodic(Node node, Queue<K> keys) {
        if (node == null) {
            return;
        }
        if (node.left != null) {//若左子树不为空，递归遍历左子树
            midErgodic(node.left, keys);
        }
        keys.enqueue(node.key);//当前结点key放入队列
        if (node.right != null) {//若右子树不为空，递归遍历左子树
            midErgodic(node.right, keys);
        }
    }

    //【后序遍历】
    public Queue<K> afterErgodic() {
        Queue<K> queue = new Queue<>();
        afterErgodic(root, queue);
        return queue;
    }

    private void afterErgodic(Node node, Queue<K> keys) {
        if (node == null) {
            return;
        }
        if (node.left != null) {//若左子树不为空，递归遍历左子树
            afterErgodic(node.left, keys);
        }
        if (node.right != null) {//若右子树不为空，递归遍历左子树
            afterErgodic(node.right, keys);
        }
        keys.enqueue(node.key);//当前结点key放入队列
    }

    //【层序遍历】：利用队列，每弹出一个结点，都会入列其子结点，以保证层序
    public Queue<K> layerErgodic() {
        Queue<K> keys = new Queue<>();//存储所有键队列（用于遍历）
        Queue<Node> nodes = new Queue<>();//存储结点队列

        nodes.enqueue(root);//先存根结点

        while (!nodes.isEmpty()) {//遍历过程
            Node node = nodes.dequeue();//从结点队列弹出一个结点
            keys.enqueue(node.key);//弹出的结点key存入键队列
            //从左往右存储子结点
            if (node.left != null) {
                nodes.enqueue(node.left);
            }
            if (node.right != null) {
                nodes.enqueue(node.right);
            }
        }
        return keys;
    }

    //【最大深度】
    public int depth() {
        return depth(root);//从根结点开始
    }

    private int depth(Node node) {
        if (node == null) {
            return 0;
        }

        int maxLeft = 0;
        int maxRight = 0;

        if (node.left != null) {//左子树最大深度
            maxLeft = depth(node.left);
        }
        if (node.right != null) {//右子树最大深度
            maxRight = depth(node.right);
        }
        //比较左右子树深度，取大者再加根结点，即整棵树的最大深度
        int max = maxLeft > maxRight ? (maxLeft + 1) : (maxRight + 1);
        return max;
    }

    public int size() {
        return n;
    }

}
