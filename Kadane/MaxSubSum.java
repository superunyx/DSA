//for possible empty subarray
//
public int maxsum(int[] nums) {
    int ans = 0;
    int best = 0;

    for (int i = 0; i < nums.length; i++) {
        best = Math.max(best, best + nums[i]);
        ans = Math.max(ans, best);
    }

    return ans;
}


//for non empty subarray just do ans=nums[0] and best=nums[0] and start for loop from i=1
