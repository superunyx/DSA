//for possible empty subarray
//

public int minsum(int[] nums) {
    int best = 0;
    int ans = 0;

    for (int i = 0; i < nums.length; i++) {
        best = Math.min(nums[i], best + nums[i]);
        ans = Math.min(ans, best);
    }

    return ans;
}


//for non empty subarray just do ans=nums[0] and best=nums[0] and start for loop from i=1
