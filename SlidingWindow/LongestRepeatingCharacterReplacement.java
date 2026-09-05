class Solution {
    public int maxcnt(int[] arr){
        int n=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
    }
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int res=0;
        int low=0;
        int n=s.length();
        for (int high=0;high<n;high++){
            freq[s.charAt(high)-'A']++;
            int len=high-low+1;
            int maxcount=maxcnt(freq);
            int diff=len-maxcount;
            while(diff>k){
                freq[s.charAt(low)-'A']--;
                low++;
                maxcount=maxcnt(freq);
                len=high-low+1;
                diff=len-maxcount;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}
