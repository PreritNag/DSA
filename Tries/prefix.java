package Tries;

public class prefix {
   static class  Node{
        Node[] Children=new Node[26];
        boolean eow=false;
        int freq;
    public  Node(){
        for(int i=0;i<Children.length;i++){
            Children[i]=null;
        }
        freq=1;
    }
}
public  static Node root=new Node();
public static void insert(String words){
    Node curr=root;
for(int i=0;i<words.length();i++){
    int idx=words.charAt(i)-'a';
    if(curr.Children[idx]==null){
        curr.Children[idx]=new Node();
    }else{
        curr.Children[idx].freq++;
    }
    curr=curr.Children[idx];
    }
    curr.eow=true;
}
public static void findPrefix(Node root, String ans){
    
    if(root==null){
        return;
    }
    if(root.freq==1){
        System.out.println(ans);
        return;
    }
for(int i=0;i<root.Children.length;i++){
if(root.Children[i]!=null){
    findPrefix(root.Children[i], ans+(char)(i+'a'));
}
}
    
}
   public static void main(String args[]){
    String arr[]={"zebra","dog","duck","dove"};
    for(int i=0;i<arr.length;i++){
        insert(arr[i]);
    }
    root.freq=-1;
    findPrefix(root, "");
   } 
}
