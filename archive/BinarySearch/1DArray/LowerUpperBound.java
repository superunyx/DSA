import java.util.*;

public class LowerUpperBound{
    public static int lowerbound(int[] nums,int n){
       int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=n){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upperbound(int[] nums,int n){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>n){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: "); 
        int size = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
           nums[i]=sc.nextInt(); 
        }
        System.out.print("Enter the number for search: ");
        int x = sc.nextInt();
        int lower= lowerbound(nums,x);
        int upper= upperbound(nums,x);
        System.out.println("Lower bound is: "+lower+" Upper Bound is: "+upper);
    }
} 
