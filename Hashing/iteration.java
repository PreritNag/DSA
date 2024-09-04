package Hashing;

import java.util.HashMap;
import java.util.Set;

public class iteration {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("prerit",100);
        map.put("kapil",10);
        map.put("manjeet",5);
        map.put("Sarthak", 99);
        Set<String> keys=map.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(k + " " + map.get(k));
        }
        System.out.println(map.entrySet());
    }
}
