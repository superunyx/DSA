import java.util.*;

public class MajorityElement{
    public static int majority(int[] nums){
        int count=0;
        int element=nums[0];
        for (int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=majority(arr);
        System.out.println("Majority element is: "+ans);
    }
}
