import java.util.Scanner;

public class LargestinAarray {
    public static int Largest(int arr[]){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
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
        int p=Largest(arr);
        System.out.println(p);
}
}