package ARRAYLIST;
import java.util.Collections;
import java.util.ArrayList;

public class Sortinglist {
     public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(111);
        Collections.sort(list);
        System.out.println(list);
}}
