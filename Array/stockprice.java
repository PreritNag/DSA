import java.util.*;
public class stockprice {
    public static int stock(int arr[]){
        int n=arr.length;
        int maxprofit=Integer.MIN_VALUE;
        int buying=arr[0];
        for(int i=1;i<n;i++){
         int profit=arr[i]-buying;
         if(profit<0)
         {
            buying=Math.min(arr[i],buying);
         }
         else if(profit>maxprofit){
            maxprofit=profit;
         }
         }
         return maxprofit;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int p=sc.nextInt();
            int arr[]=new int[p];
            for(int i=0;i<p;i++){
                arr[i]=sc.nextInt();
            }
            int maxprofit=stock(arr);
            System.out.println(maxprofit);
        }
    }

