package Hashing;

import java.util.HashMap;

public class createmap {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("prerit",100);
        map.put("kapil",10);
        map.put("manjeet",5);
        System.out.println(map);
        int mark=map.get("prerit"); 
        System.out.println(mark);
        System.out.println(map.containsKey("sarthak"));
        map.remove("manjeet");
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());

    }
}
