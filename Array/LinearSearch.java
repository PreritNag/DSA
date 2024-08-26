package Array;

import java.util.*;
public class LinearSearch{
    public static int Linear(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
            return 1;
            }
            
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[]=new int[10];
        System.out.println("Enter a number");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
     }
     int p=Linear(arr,8);
     if(p==1){
        System.out.println("number found");
     }
     else{
         System.out.println("not number found");
     }
    }
}