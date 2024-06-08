package Leetcode;
import java.util.*;
public class lengthoflastword {
    public static int lengthOfLastWord(String s) {
        int c= 0;
        for(int i=s.trim().length()-1;i>=0;i--){
           
            if(s.trim().charAt(i)==' '){
               
                break;
            } 
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));  

    }
}
