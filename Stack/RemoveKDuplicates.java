class Solution {

    class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Pair> st = new Stack<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                st.push(new Pair(s.charAt(i), 1));
                continue;
            }

            if (st.peek().ch != s.charAt(i)) {
                st.push(new Pair(s.charAt(i), 1));
                continue;
            }

            if (st.peek().count < k - 1) {
                Pair p = st.pop();   // take the top pair
                p.count++;           // increase its count
                st.push(p);          // put it back
                continue;
            }

            st.pop();
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {

            Pair p = st.pop();       // take the pair

            while (p.count > 0) {
                sb.append(p.ch);     // add the character
                p.count--;
            }
        }

        return sb.reverse().toString();
    }
}
