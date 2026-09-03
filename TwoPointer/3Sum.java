class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int sum=(-1)*nums[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                if(nums[left]+nums[right]==sum){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[left]+nums[right]<sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}
