package Trees;
import java.util.*;
public class sumnode  {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class binarytree {
        static int idx = -1;

        public static Node builttree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builttree(nodes);
            newNode.right = builttree(nodes);
            return newNode;
        }
    }

    static int c = 0;

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        c=c+root.data;
        int lf = sum(root.left);
        int rf = sum(root.right);
        return c;
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.builttree(nodes);
        System.err.println(sum(root));
}
}