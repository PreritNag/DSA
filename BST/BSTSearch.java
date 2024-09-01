package BST;

public class BSTSearch {
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
    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data<key){
            return Search(root.right,key);
    }
    else{
        return Search(root.left,key);}
    }
    public static void main(String[] args) {
        int nodes[] = { 4,2,1,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        binarytree tree = new binarytree();
        Node root = tree.builttree(nodes);
        if(Search(root, 10)){
            System.out.println("key is found");
        }
        else{
            System.out.println("key is not found");
        }
    }
}
