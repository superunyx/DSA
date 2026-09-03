class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int b=1;b<nums.length;b++){
            if(nums[b]!=nums[a]){
                a++;
                nums[a]=nums[b];
            }
        }
        return a+1;
    }
}
