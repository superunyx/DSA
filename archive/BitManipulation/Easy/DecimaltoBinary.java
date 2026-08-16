class Solution {
    static String reverse(String s){
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    static String decToBinary(int n) {
        int number=n;
        StringBuilder ans = new StringBuilder();
        while(number!=1){
            if(number%2==1){
                ans.append('1');
            }
            else{
                ans.append('0');
            }
            number=number/2;
        }
        ans.append('1');
        return reverse(ans.toString());
    }
}
