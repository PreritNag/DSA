package ARRAYLIST;

import java.util.ArrayList;

public class reverse {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int n=list.size()-1;
        for(int i=n;i>=0;i--){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    
}
