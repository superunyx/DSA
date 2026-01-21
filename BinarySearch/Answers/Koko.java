class Solution {
    public int findMax(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public int eatingspeed(int[] piles, int rate){
        int totalhour=0;
        for (int i=0;i<piles.length;i++){
            totalhour+=Math.ceil((double)piles[i]/(double)rate);
        }
        return totalhour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int total=eatingspeed(piles,mid);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
