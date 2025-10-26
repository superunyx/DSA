import java.util.*;

public class KPositive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the " + n + " elements (positive numbers):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum (k):");
        int k = sc.nextInt();
        int result = longestSubarray(nums, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + result);
    } 
    public static int longestSubarray(int[] nums, int k) {
        int maxLen = 0;
        int sum = 0;
        int i = 0; // start of the sub array
        for (int j = 0; j < nums.length; j++) { // end of the sub array
            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            if (sum == k) {
                // FIX: The length is (j - i + 1)
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
