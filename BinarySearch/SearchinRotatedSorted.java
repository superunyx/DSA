class Solution {

    public int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;
        int n=nums.length;

        while(low<=high){

            int mid=(low+high)/2;

            // Target found
            if(nums[mid]==target){
                return mid;
            }

            // Mid is in the left part
            else if(nums[mid]>nums[n-1]){

                // Target is to the right of mid
                if(nums[mid]<target){
                    low=mid+1;
                }

                else{

                    // Target is in the right part
                    if(nums[n-1]>=target){
                        low=mid+1;
                    }

                    // Target is in the left part
                    else{
                        high=mid-1;
                    }
                }
            }

            // Mid is in the right part
            else{

                // Target is to the left of mid
                if(nums[mid]>target){
                    high=mid-1;
                }

                else{

                    // Target is in the left part
                    if(nums[n-1]<target){
                        high=mid-1;
                    }

                    // Target is in the right part
                    else{
                        low=mid+1;
                    }
                }
            }
        }

        return -1;
    }
}
