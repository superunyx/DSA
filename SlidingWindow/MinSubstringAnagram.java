class Solution {
    public boolean match(int[] have,int[] needed){
        for (int i=0;i<256;i++){
            if(have[i]<needed[i]){
                return false;
            }
        }
        return true;

    }
    public String minWindow(String s, String t) {
        int res=Integer.MAX_VALUE;
        int low=0;
        int[] have = new int[256];
        int[] needed = new int[256];
        for(int i=0;i<t.length();i++){
            needed[t.charAt(i)]++;
        }
        int start=0;
        for (int high=0;high<s.length();high++){
            have[s.charAt(high)]++;
            while(match(have,needed)){
                int len=high-low+1;
                if(res>len){
                    res=len;
                    start=low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if(res==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+res);
    }
}
