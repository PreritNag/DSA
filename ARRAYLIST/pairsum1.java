package ARRAYLIST;

import java.util.ArrayList;

public class pairsum1 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int n=list.size();
        int ls=0;
        int rs=n-1;
        int key=3;
        boolean found=false;
        while(ls!=rs){
            if((list.get(ls)+list.get(rs))==key){
                System.out.println(ls+","+rs);
                found=true;
                break;
            }
            else if((list.get(ls)+list.get(rs))>key){
                rs--;
            }
            else if((list.get(ls)+list.get(rs))<key){
                ls++;
            }}
            if(!found){
                System.out.println("no pair exist");
            }
        }
    }
    

