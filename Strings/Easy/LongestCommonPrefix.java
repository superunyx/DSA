class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0 ) return"";
        // pick the first word
        String prefix = strs[0];// ["flower"]
        // initialize word length
        int prefixLen = prefix.length();

        // start from the second word
        for(int i = 1; i < strs.length; i++){
            String s = strs[i];
            // check the first word length and word prefix characters
            // ["flow","flight"]
            while(prefixLen > s.length() || !prefix.equals(s.substring(0, prefixLen))){
                // if the first word length is longer than second word or prefix is not equal to second word
                // subtract first word length
                prefixLen--;
                // if it still not equal, the first word length would 0, so return it with blank string
                if(prefixLen == 0){
                    return "";
                }
                // if its equal, swap first word to prefix only
                prefix = prefix.substring(0,prefixLen);
            }
        }
        return prefix;
    }
}

// both work
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j=1;
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String prefix=strs[0];
        for(j=1;j<strs.length;j++){
            int k=0;
            while(k<prefix.length()&&k<strs[j].length()&&prefix.charAt(k)==strs[j].charAt(k)){
                k++;
            }
            prefix=prefix.substring(0,k);
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
