class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=(double)nums[i];
            sum-=(double)nums[i-k];
            double newavg = sum/(double)k;
            if(newavg>maxavg){
                maxavg=newavg;
            }
        }
        return maxavg;
    }
}
