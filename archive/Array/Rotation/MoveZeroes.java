import java.util.*;

class Solution {
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if (nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Solution s= new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        s.moveZeroes(arr);
        System.out.print("Output:\t");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
