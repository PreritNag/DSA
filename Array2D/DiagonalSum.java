package Array2D;
import java.util.*;
public class DiagonalSum {
    public static int DiagonalSums(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3}, {4,5,6},{7,8,9}};
        int p=DiagonalSums(arr);
        System.out.println(p);
    }
}
