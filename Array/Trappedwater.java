import java.util.*;
public class Trappedwater {
public static int trappingwater(int arr[],int width){
        int trappedwater=0;
        int n=arr.length;
        int MaxLeft[]=new int[n];
         MaxLeft[0]=arr[0];
        for(int i=1;i<n;i++){
         MaxLeft[i]=Math.max(arr[i],MaxLeft[i-1]);
        }
        int MaxRight[]=new int[n];
        MaxRight[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            MaxRight[i]=Math.max(arr[i],MaxRight[i+1]);
        }
        for(int i=0;i<n;i++){
        int waterlevel=Math.min(MaxLeft[i],MaxRight[i]);
        int trapped=(waterlevel-arr[i])*width;
         trappedwater=trappedwater+trapped;
        }
        return trappedwater;
    }
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter width");
        int p=sc.nextInt();

        int o=trappingwater(arr, p);
        System.out.println(o);
        }
    }
