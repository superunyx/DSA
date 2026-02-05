class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        long no=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if (s.charAt(i)=='+'){
            i++;
        }

        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit = s.charAt(i)-'0';
            no=(no*10)+digit;
            if((sign*no)>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if((sign*no)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*no);
    }
}
