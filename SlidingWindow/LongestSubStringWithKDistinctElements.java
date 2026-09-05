class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){ 
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.size()>k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            if(map.size()==k){
                res=Math.max(res,high-low+1);
            }
        }
        return (res==Integer.MIN_VALUE)?-1:res;
    }
}
