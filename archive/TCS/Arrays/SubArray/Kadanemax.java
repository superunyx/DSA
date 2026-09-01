import java.util.*;

// Class to find the maximum contiguous subarray sum using Kadane's Algorithm
public class Kadanemax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Handle empty array edge case
        if(n==0){
            return;
        }
        // Read array elements
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Initialize overall maximum answer and current maximum sum ending at the first element
        int ans=arr[0];
        int maxsum=arr[0];
        // Traverse the array starting from the second element
        for(int i=1;i<n;i++){
            // Option 1: Extend the existing subarray
            int v1=maxsum+arr[i];
            // Option 2: Start a new subarray with the current element
            int v2=arr[i];
            // Take the best option for subarray ending at index i
            maxsum=Math.max(v1,v2);
            // Update the global maximum subarray sum
            ans=Math.max(ans,maxsum);
        }
        // Print the result
        System.out.print(ans);
    }
}

// Alternative approach for Kadane's Algorithm:
//
// int ans=Integer.MIN_VALUE; // Global maximum sum
// int sum=0;                 // Current running sum
// for (int i=0;i<n;i++){
//     sum+=arr[i];           // Add current element to running sum
//     ans=Math.max(sum,ans); // Update max answer if current sum is greater
//     if(sum<0){             // If running sum drops below 0, reset it
//         sum=0;
//     }
// }

