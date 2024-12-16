package Tries;

public class startwith {
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
public static boolean startWith(String prefix){
    Node curr=root;
    for(int i=0;i<prefix.length();i++){
        int idx=prefix.charAt(i)-'a';
        if(curr.Children[idx]==null){
            return false;
        }
        curr=curr.Children[idx];
    }
    return true;
}
   public static void main(String args[]){
    String arr[]={"apple","app","mango","man","women"};
    String prefix1="app";
    String prefix2="moon";
    for(int i=0;i<arr.length;i++){
        insert(arr[i]);
    }
   System.out.println(startWith(prefix1));
   System.out.println(startWith(prefix2));
   } 
}
