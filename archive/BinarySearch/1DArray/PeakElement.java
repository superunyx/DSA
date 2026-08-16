// return any peak doesnt have to be the max peak 
//
// compare in adjacent indices and move towards the big one untill mid is peak
//
// edge cases if n==1 or 0 is greatest and last is peak



public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1 || nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
