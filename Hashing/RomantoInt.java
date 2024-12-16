package Hashing;

import java.util.HashMap;

public class RomantoInt {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        String s="LVIII";
        int i=0;
        int p=0;
        while(i<s.length()){
             p= p +(int)map.get(String.valueOf(s.charAt(i)));
            i++;
        }
        System.out.println(p);
    }
}
