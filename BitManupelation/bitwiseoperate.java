package BitManupelation;

import java.util.Scanner;

public class bitwiseoperate {
    public static void bitwiseoperat(int n){
        System.out.println(n&2);
        System.out.println(n|2);
        System.out.println(n<<2);
        System.out.println(n>>2);
        System.out.println(~n);
        System.out.println(n^2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        bitwiseoperat(s);
    }
}
