package Trees;

import java.util.ArrayList;

public class Kthansistor {
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
    }    public static boolean  pathfinder(Node root,ArrayList<Integer> path,int n){
        if(root==null){
            return false;
        }
        path.add(root.data);
        if(root.data==n){
            return true;
        }
       boolean found = pathfinder(root.left, path, n);
       boolean found1 = pathfinder(root.right, path, n);
       if(found || found1){
           return true;
       }
       path.remove(path.size()-1);
       return false;
    }
    public static void kthans(Node root,int k,int n){
        ArrayList<Integer> path=new ArrayList<>();
        pathfinder(root,path,k);
        int s=path.size()-1;
       System.out.println(path.get(s-n));
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.builttree(nodes);
        kthans(root, 5, 1);
    }
}
