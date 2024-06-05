package DSA.Stack;

import java.util.Stack;

public class MaximumHistogram {
    public static void maxhisto(Stack<Integer>s,int arr[]){
    s.push(arr[0]);
    int area1;
    int q1=0;int p=0; int p1=0; int q=0;
    boolean d=false;
    boolean o=false;
    for(int i=1;i<arr.length;i++){
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]>arr[j]){
            p=j-i-1;
            d=true;
            break;
            }
        }
        if(d==false){
         q=arr.length-1-i;
        }
        d=false;
       for(int j=i-1;j>=0;j--){
            if(arr[i]>arr[j]){
            p1=i-j;
            o=true;
            break;
            }
        } 
        if(o==false){
         q1=i+1;
        }
        o=false;
        area1=(arr[i])*(q+p+q1+p1);
        s.push(area1);
        q=0;
        p=0;
        q1=0;
        p1=0;
    }

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]={3,5,1,7,5,9};
        maxhisto(s, arr);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
