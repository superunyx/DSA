class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lowest=-1;
        int highest=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                if(nums[mid]==target){
                    lowest=mid;
                }
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                if(nums[mid]==target){
                    highest=mid;
                }
                low=mid+1;
            }
        }
        return new int[]{lowest,highest};
    }
}
