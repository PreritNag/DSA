
package BitManupelation;

import java.util.Scanner;

public class ithbir {
    public static void getithbit(long n,int i){
        if((n&(1<<i))==0){
            System.out.println("ith bit is zero");
        }
        else{
            System.out.println("ith bit is not zero");
        }
    }
    public static long setithbit(long n,int i,int p){
        long x;
        if(p==0)
        {
          x=n^(1)<<i;
        }
        else{
            x=n|1<<i;
        }
        return x;
    }
    public static long clearithbit(long n,int i)
    {
       long x;
       x=n&(~(1<<i));
       return x;
    }
    public static long clearlastithbit(long n,int i){
        return n&(-1<<(i+1));
    }
   
    public static long clearrangeofbit(long n, int i, int j) {
        long x;
        x = n & ((~0) << (j + 1));
        long p = x | (1 << (i - 1));
        return p;
    }
    
    public static long decimatobin(long n) {

        long p = 0;
        int c = 0;
        while (n != 0) {
            long r = n % 10;
            p = p + r * (long) Math.pow(2, c);
            n = n / 10;
            c++;
        }
        return p;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in binary form");
        long n=sc.nextLong();
        System.out.println("Enter i th position at which you want to perform operation");
        int i = sc.nextInt();

        System.out.println("Enter the range of j");
        int j = sc.nextInt();

        System.out.println("Enter whether you want to set 0 or 1 in ith position");
        int p = sc.nextInt();

        getithbit(n, i);
       long n1= setithbit(n, i, p);
       long n2= clearithbit(n, i);
       long n3= clearlastithbit(n, i);
       long n4= clearrangeofbit(n, i, j);
       System.out.println(decimatobin(n1));
       System.out.println(decimatobin(n2));
       System.out.println(decimatobin(n3));
       System.out.println(decimatobin(n4));
    }

    }
