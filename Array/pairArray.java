import java.util.*;
public class pairArray {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pair(arr);
}
}