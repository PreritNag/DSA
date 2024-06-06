package Trees;

public class tree1 {
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
    public static class binarytree{
    static int idx=-1;
    public static Node builttree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=builttree(nodes);
        newNode.right=builttree(nodes);
        return newNode;
    }
    }
    public static void main(String args[]){
        int nodes[]={3,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.builttree(nodes);
        System.out.println(root.data);
    }
}
