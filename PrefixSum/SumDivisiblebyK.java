class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        int sum=0;
        map.put(0, 1);
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int check=Math.floorMod(sum,k);
            int freq=map.getOrDefault(check,0);
            ans+=freq;
            map.put(check, map.getOrDefault(check, 0) + 1);
        }
        return ans;
    }
}
