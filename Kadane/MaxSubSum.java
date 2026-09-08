class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int best=0;
        for (int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=best+nums[i];
            best=Math.max(v1,v2);
            maxsum=Math.max(maxsum,best);
        }
        return maxsum;
    }
}
