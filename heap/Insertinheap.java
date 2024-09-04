package heap;
import java.util.*;
public class Insertinheap {
   static class Heap{
    ArrayList<Integer> arr=new ArrayList<>();
    public void add(int data){
        arr.add(data);
        int x=arr.size()-1;
        int p=(x-1)/2;
        while(arr.get(x)<arr.get(p)){
            int temp=arr.get(x);
            arr.set(x,arr.get(p));
            arr.set(p,temp);
            x=p;
            p=(x-1)/2;
        }
    }
   public int peek(){
       return arr.get(0);
   }
   public int remove(){
    int data=arr.get(0);
    //step1-swap first and last element
    int temp=arr.get(0);
    arr.set(0,arr.get(arr.size()-1));
    arr.set(arr.size()-1,temp);
    //step2-delete last
    arr.remove(arr.size()-1);
    //step3-heapify
    heapify(0);
    return data;
   }
   public void heapify(int i){
    int left=2*i+1;
    int right=2*i+2;
    int min=i;
    if(left<arr.size() && arr.get(left)<arr.get(min)){
        min=left;
    }
    if(right<arr.size() && arr.get(right)<arr.get(min)){
        min=right;
    }
    if(min!=i){
        int temp=arr.get(i);
        arr.set(i,arr.get(min));
        arr.set(min,temp);
        heapify(min);
    }
   }
   public static void main(String[] args) {
    Heap h=new Heap();
    h.add(3);
    h.add(4);
    h.add(1);
    h.add(5);
    while(!h.arr.isEmpty()){
        System.out.println(h.peek());
    h.remove();
    }}}}
