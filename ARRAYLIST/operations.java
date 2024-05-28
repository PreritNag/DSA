package ARRAYLIST;

import java.util.ArrayList;

public class operations {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);//............addition................
        System.out.println(list);
        int p=list.get(0);//.........kisi bhi index ki value pta karne ka liya or store karne ka liya........
        System.out.println(p);
        System.out.println(list);
        list.remove(0);//........remove karne ka liya.........
        System.out.println(list);
        list.set(0, 7);//.......kisi bhi index par dusri value set karne ka liya.......
        System.out.println(list);
       if(true==list.contains(7)){//......element exist karta ha ya ni........
           System.out.println("hello");
       }        

    }
}
