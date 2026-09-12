class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        boolean single =false;
        int count=0;
        for (char c: map.keySet()){
            if(map.get(c)%2==1){
                single=true;
            }
            int enter=map.get(c)/2;
            count+=enter;
        }
        if(single){
            return count*2+1;
        }
        else{
            return count*2;
        }
    }
}
