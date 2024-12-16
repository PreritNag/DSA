package Hashing;

import java.util.HashMap;
import java.util.Set;

public class majority {
    public static void main(String args[]){
        int arr[]={1,3,2,5,1,3,1,5,1};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     // map.put(arr[i],map.containsKey(arr[i])?map.put(arr[i],map.get(arr[i])+1):1);
        //     map.put(arr[i],0);
        // }
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }
        // }this is also fine
        for(int i=0;i<n;i++){
            map.put(arr[i],map.containsKey(arr[i])?map.get(arr[i])+1:1);
        }

        Set<Integer> keys=map.keySet();
        // System.out.println(keys);
        for (Integer k : keys) {
            // System.out.println(k + " " + map.get(k));
            if(map.get(k)>n/3){
                System.out.println(k);
            }
        }
        System.out.println(map.entrySet());
    
    }
}
