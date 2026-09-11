class Solution {
    public String reverse(String s){
        StringBuilder ans= new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek()==s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return reverse(ans.toString());
    }
}
