package Trees;

public class subtreeofanot {
    static class Node{
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
        public static Node buildTreeWithReset(int nodes[]) {
            idx = -1; // Reset idx before building a new tree
            return builttree(nodes);
                }}

        public static boolean areIdentical(Node root,Node subroot){
            if(root==null&&subroot==null){
                return true;
            }
            if(root==null||subroot==null){
                return false;
            }
            return (root.data==subroot.data&&areIdentical(root.left, subroot.left)&&areIdentical(root.right, subroot.right));
        }
        public static boolean checktree(Node root,Node subroot){
            if(subroot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(areIdentical(root,subroot)){
                return true;
            }
            return checktree(root.left, subroot)||checktree(root.right,subroot);
        }
        public static void main(String[] args) {
            int nodes[] = { 1, 2, 3, -1, -1, 4, -1, -1, 3, -1, 4, -1, -1 };
            int subnodes[] = { 2, 3, -1, -1, 4, -1, -1, -1, -1 };
            binarytree tree = new binarytree();
            Node root = tree.buildTreeWithReset(nodes);
            Node subroot = tree.buildTreeWithReset(subnodes);
            if (checktree(root, subroot)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}
