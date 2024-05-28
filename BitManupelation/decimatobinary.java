package BitManupelation;

import java.util.Scanner;

public class decimatobinary {
    public static long decimatobin(long n){
      
        long p=0;
        int c=0;
        while(n!=0){
       long r=n%10;
       p=p+r*(long)Math.pow(2,c);
       n=n/10;
        c++;
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long s=sc.nextLong();
        long k=decimatobin(s);
        System.out.println(k);
    }
}
