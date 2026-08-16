// first check for edge cases if n==1 return [0]
//
// check for first element if [0]==[1] and last element if [n-1]==[n-2]
//
// after that 
//
// left side of single element will have odd,even pairs 
// and right side will have even,odd pairs
//
// first check is mid!=mid-1 and mid+1 if true return mid
//
//
// after that check for mid index even or odd and check adjacent index according to e
// eleminate the half that single element doesnt lie on
//
// repeat untill mid!=mid-1 and mid+1 
//
//
//

public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if((mid%2==1)&&nums[mid]==nums[mid-1]||(mid%2==0&&nums[mid]==nums[mid+1]))
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
