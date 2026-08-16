import java.util.*;

public class PositiveandNegative{
    public static int longestSubarray(int[] nums, int k){
        int maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum=0;
        for (int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum==k){
                maxLen=i+1;
            }
            int rem=currentSum-k;
            if(map.containsKey(rem)){
                int length=i-map.get(rem);
                maxLen=Math.max(maxLen,length);
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum,i);
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum (k):");
        int k = sc.nextInt();
        int result = longestSubarray(nums, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + result);
    } 
} 
