package heap;

public class Heapsort {
    public static void heapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public static void heapify(int arr[],int size,int i){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;}
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,size,maxIdx);
        }
    }

    public static void main(String args[]){
        int arr[]={5,3,4,2,1};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
