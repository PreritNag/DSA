package DSA.Array;

import java.util.*;
public class MaxSubArray2 {
 public static int SubArray(int arr[]){
    int cursum=0;
    int maxsum=Integer.MIN_VALUE;
    int prifix[]=new int[arr.length];
    prifix[0]=arr[0];
  for(int i=1;i<arr.length;i++){
    prifix[i]=prifix[i-1]+arr[i];
  }
  for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        int start=i;
        int end=j;
        cursum= (start==0) ? prifix[end]: prifix[end]-prifix[start-1];
        if(cursum>maxsum){
            maxsum=cursum;
        }
    }
  }
  return maxsum;
 }   
 public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      int p=SubArray(arr);
      System.out.println(p);
}}



