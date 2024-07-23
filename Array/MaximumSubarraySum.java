package DSA.Array;

import java.util.*;
public class MaximumSubarraySum {
    public static int SubSum(int arr[]){
        int n=arr.length;
        int sum=0;
        int x=0;
        int prr[]=new int[(n*(n+1))/2];
         for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                 sum = sum + arr[k];}
                  if(x<prr.length){
                    prr[x]=sum;
                    x++;
                    sum=0;
                  }
                }
            }
             int largest=prr[0];
        for(int i=1;i<prr.length;i++){
            if(largest<prr[i]){
                largest=prr[i];
            }
        }
        return largest;
        }
    
     public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    int v=SubSum(arr);
    System.out.println(v);
}
}


// import java.util.*;

// public class MaximumSubarraySum {
//     public static void SubSum(int arr[]){
//         int n = arr.length;
//         int x = 0;
//         int prr[] = new int[(n*(n+1))/2];
        
//         for(int i = 0; i < n; i++){
//             int sum = 0;
//             for(int j = i; j < n; j++){
//                 sum += arr[j];
//                 prr[x] = sum;
//                 x++;
//             }
//         }
        
//         // Now, prr array contains all possible subarray sums
//         // You can perform further processing here, such as finding the maximum sum
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i < prr.length; i++){
//             maxSum = Math.max(maxSum, prr[i]);
//         }
        
//         System.out.println("Maximum subarray sum: " + maxSum);
//     }

//     public static void main(String args[]) {
//         int arr[] = new int[5];
//         System.out.println("Enter 5 numbers:");
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         SubSum(arr);
//     }
// }

