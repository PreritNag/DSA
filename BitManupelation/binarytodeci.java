package BitManupelation;
import java.util.*;
public class binarytodeci {
    public static long binarytodec(long n){
        long r;
        long p=0;
        int c=0;
    while(n!=0){
        r=n%2;
        n=n/2;
        p=p+r*(long)Math.pow(10,c);
        c++;
    }
    return p;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long s=sc.nextInt();
        long k=binarytodec(s);
        System.out.println(k);
    }
}
