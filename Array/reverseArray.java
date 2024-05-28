import java.util.*;
public class reverseArray{
    public static void Reverses(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){//ye yaad rakhna ki n/2 maat bhulna
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
  
    }
    
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Reverses(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}