package Trees;

public class Kthlevel {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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

    public static void Kthlevel(Node root,int k,int n){
        if(root==null){
            return;
        }
        if(k==n){
            System.out.print(root.data);
        }
        Kthlevel(root.left, k, n+1);
        Kthlevel(root.right, k, n+1);
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.builttree(nodes);
        Kthlevel(root, 2, 1);
    }
}
