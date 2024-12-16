package Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
     for(int i=0;i<n;i++){
         if(nums[i]==val && nums[i]!=nums[nums.length-1]){
             nums[i]=nums[nums.length-1];
            //  nums[nums.length-1]=val;
            n--;
            removeElement(nums, val);
         }
}
for(int i=0;i<n;i++){
System.out.println(nums[i]);}

return nums.length;}
public static void main(String args[]){
    int arr[]={3,2,2,3,3};
    int val=3;
    RemoveElement r=new RemoveElement();
    System.out.println(r.removeElement(arr,val));
}}

