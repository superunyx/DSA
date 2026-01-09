// 
//
//
//
//
//
//Search position where target will be inserted (can return both ans and low 
// both will be same value at the end)

public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
