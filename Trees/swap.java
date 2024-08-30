package Trees;
import java.util.*;

public class swap {
    public static class Node{
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

public static Node swap(Node root){
    if(root==null){
        return null;
    }
    Node temp=root.left;
    root.left=root.right;
    root.right=temp;
    swap(root.left);
    swap(root.right);
    return root;
}
public static void level(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }

        }else{
           System.out.print(currNode.data +"");
        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if(currNode.right!=null){
            q.add(currNode.right);
        }
    }}
    
}

public static void main(String args[]) {
    int nodes[] = {4,2,1,-1,-1,3,-1,-1,7,6,-1,-1,9,-1,-1};
    binarytree tree = new binarytree();
    Node root = tree.builttree(nodes);
    level(swap(root));
}
}
