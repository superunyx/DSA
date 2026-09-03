//no need to skip duplicates
//
//
//
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int cnt=0;
        Arrays.sort(arr);
        int n=arr.length;
        for (int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s=arr[left]+arr[right]+arr[i];
                if(s<sum){
                    cnt+=right-left;
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return cnt;
    }
}
