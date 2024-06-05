package DSA.Stack;
import java.util.Stack;
public class NextGreaterElement {
    public static void NGE(Stack<Integer> s,int arr[]){
        Boolean c=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    s.push(arr[j]);
                    c=true;
                    break;
                }
            }
            if(c==false){
                s.push(-1);
            }
            c=false;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack();
       int arr[]={1,3,2,4};
       NGE(s,arr);
       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}
