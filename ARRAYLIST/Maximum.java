package ARRAYLIST;

import java.util.ArrayList;

public class Maximum {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(111);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
    
}
