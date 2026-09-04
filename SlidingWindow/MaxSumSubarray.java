class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum=0;
        for (int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        int sum=maxsum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}
