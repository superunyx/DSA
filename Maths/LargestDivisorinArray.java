class Solution {
    public int findGCD(int[] nums) {
        int lowest=Integer.MAX_VALUE;
        int highest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<lowest){
                lowest=nums[i];
            }
            if(nums[i]>highest){
                highest=nums[i];
            }
        }
        while(true){
            int remainder=highest%lowest;
            if(remainder==0){
                break;
            }
            highest=lowest;
            lowest=remainder;
        }
        return lowest;
    }
}
