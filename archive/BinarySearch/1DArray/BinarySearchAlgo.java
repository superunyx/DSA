import java.util.*;
// Recursive method
public class BinarySearch{
    public int bin(int[] nums, int low, int high, int target){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if (nums[mid]<target){
            return bin(nums,mid+1,high,target);
        }
        else{
            return bin(nums,low,mid-1,target);
        }
    }
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return bin(nums,low,high,target);
    }
}
    public static void main(String[] args){
        }
// Iterative method
//
public int search(in[] nums, int target){
    int low =0;
    int high=nums.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return -1;
}
