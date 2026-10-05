class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(low<high){
            int min=Math.min(height[low],height[high]);
            int area=min*(high-low);
            if(area>ans){
                ans=area;
            }
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return ans;
   }
}
