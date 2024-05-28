import java.util.*;
public class BinarySearch {
    public static int BINARY(int arr[], int key){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return 1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
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
     int p=BINARY(arr,8);
     if(p==1){
        System.out.println("number found");
     }
     else{
         System.out.println("not number found");
     }
    }

    }
