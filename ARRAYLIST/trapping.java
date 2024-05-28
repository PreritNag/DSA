package ARRAYLIST;

import java.util.ArrayList;

public class trapping {
    public static void main(String args[]){
        int width;
        int area;
        int max=Integer.MIN_VALUE;
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            int min=Math.min(list.get(i),list.get(j));
            width=j-i;
            area=min*width;
            if(area>max){
                max=area;
            }
        }
    }
    System.out.println(max);
}}
