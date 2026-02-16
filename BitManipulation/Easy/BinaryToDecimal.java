// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        int result = 0;
        for (int i=0;i<b.length();i++){
            result=result*2 + (b.charAt(i)-'0');
        }
        return result;
    }
}
