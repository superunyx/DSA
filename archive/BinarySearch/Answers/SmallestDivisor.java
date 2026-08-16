class Solution {
    public int maximum(int[] nums){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int division(int[] nums, int divisor){
        int total=0;
        for (int i=0;i<nums.length;i++){
            total+=Math.ceil((double)nums[i]/divisor);
        }
        return total;
    }
    public boolean possible(int[] nums, int divisor,int threshold){
        int total=division(nums,divisor);
        if (total<=threshold){
            return true;
        }
        else{
            return false;
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maximum(nums);
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
