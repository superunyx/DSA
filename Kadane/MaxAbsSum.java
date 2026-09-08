class Solution {
    public int maxsum(int[] nums){
        int ans=0;
        int best=0;
        for (int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=best+nums[i];
            best=Math.max(v1,v2);
            ans=Math.max(ans,best);
        }
        return ans;
    }
    public int minsum(int[] nums){
        int ans=0;
        int best=0;
        for (int i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=best+nums[i];
            best=Math.min(v1,v2);
            ans=Math.min(ans,best);
        }
        return ans;
    }
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=maxsum(nums);
        int minsum=minsum(nums);
        return Math.max(maxsum,Math.abs(minsum));
    }
}
