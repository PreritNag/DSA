package Trees;
public class countofnode {
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

    public static int count(Node root) {
        int x=0;
        if (root == null) {
            return 0;
        }
        c++;
        int lf =count(root.left);
        // while(root.left!=null){
        //     x=x+root.left.data;
        //     root=root.left;
        // }
        
       
        int rf = count(root.right);
        return c;
    }
    
    public static int sumleft(Node root){
        int l=0;
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            l=l+root.left.data;
        }
     l=l+sumleft(root.left);
     l=l+sumleft(root.right);
    System.out.println(l);
        return l;
        
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 1,-1,-1, 6, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.builttree(nodes);
       
        System.out.println(sumleft(root));
    }
}
