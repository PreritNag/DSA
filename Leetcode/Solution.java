package Leetcode;
import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isSymbol(ch)) {
                continue;
            }
            if (Character.isUpperCase(ch)) {
                
                 str = str +  Character.toLowerCase(ch);
                 continue;
            }
            str = str + ch;
        }
        System.out.println(str);
        String c="";
        for(int i=str.length()-1;i>=0;i--){
            c=c+str.charAt(i);
        }
        System.out.println(c);
        if(str.equals(c)){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(isPalindrome(s)){
      System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
}
// A man, a plan, a canal: Panama