class Solution {
    public long findhour(int[] piles, int speed){
        long h=0;
        for (int i=0;i<piles.length;i++){
            h+=piles[i]/speed;
            if(piles[i]%speed!=0){
                h++;
            }
        }
        return h;
    }
    public int maxelement(int[] piles){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int low=1;
         int high=maxelement(piles);
         int ans=-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(findhour(piles,mid)>h){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
         }
         return ans;
    }
}
