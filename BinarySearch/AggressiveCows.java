class Solution {
    public boolean possible(int[] arr,int guess, int k){
        int cows=1;
        int prevpos=arr[0];
        for (int i=1;i<arr.length;i++){
            int distance=arr[i]-prevpos;
            if(distance<guess){
                continue;
            }
            cows++;
            prevpos=arr[i];
        }
        if(cows>=k){
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(!possible(arr,mid,k)){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}
