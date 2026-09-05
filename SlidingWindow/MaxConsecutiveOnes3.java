class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int n=nums.length;
        int zero=0;
        int res=0;
        for (int high=0;high<n;high++){
            if (nums[high]==0){
                zero++;
            }
            while(zero>k){
                if(nums[low]==0){
                    zero--;
                }
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}
