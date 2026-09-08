class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int minsum=Integer.MAX_VALUE;
        int best=0;
        for (int i=0;i<arr.length;i++){
            int v1=arr[i];
            int v2=best+arr[i];
            best=Math.min(v1,v2);
            minsum=Math.min(best,minsum);
        }
        return minsum;
    }
}
