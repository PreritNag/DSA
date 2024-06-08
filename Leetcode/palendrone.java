package Leetcode;
import java.util.*;
public class palendrone {
        public static boolean isPalindrome(String x) {
            String str="";
            for (int i = x.length()-1; i>=0; i--) {
                str = str + x.charAt(i);
            }
            if (str.equals(x)) {
                return true;
            } return false;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String x=sc.next();
            if(isPalindrome(x)){
                System.out.println("palin");
            }
            else{
                System.out.println("not palin");
            }
        }
    }

