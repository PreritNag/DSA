package ARRAYLIST;

import java.util.ArrayList;

public class pair2 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int ls=0;
        int rs=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)<list.get(i)){
                  ls=j;
                  rs=i;
                  break;
                }
            }
        }
        int key=16;
        int n=list.size();
        boolean found=false;
    while(ls!=rs){
        if((list.get(ls)+list.get(rs))==key){
            System.out.println(ls+","+rs);
            found=true;
            break;
        }
        else if((list.get(ls)+list.get(rs))<key){
        ls=(ls+1)%n;
        }
        else if((list.get(ls)+list.get(rs))>key){
            rs=(rs+n-1)%n;
        }
    }
    if(!found){
        System.out.println("no pair found");
    }
    
    }
}
