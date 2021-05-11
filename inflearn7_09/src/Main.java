class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}
public class Main {
    static int level = 0;
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0, root));
    }

    public static int DFS(int level, Node root) {
        if(root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
        }
    }
}
