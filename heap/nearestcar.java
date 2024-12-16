package heap;
import java.util.*;

public class nearestcar{
    public static void nearest(int arr[][],PriorityQueue<Integer> s){
        int d=0;
        for(int i=0;i<arr.length;i++){
        d=0;
        for(int j=0;j<arr[i].length;j++){
             d+=(arr[i][j]*arr[i][j]);
            }
            s.add(d);
    }        
    }
    public static void main(String args[]){
        PriorityQueue<Integer> s=new PriorityQueue<>();
        int arr[][]={{3,3},{5,-1},{-2,4}};
        nearest(arr,s);
        for(int i=0;i<s.size();i++){
            System.out.println(s.peek());
            s.remove();
        }
    }
}