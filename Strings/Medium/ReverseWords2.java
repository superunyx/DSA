class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            // skip spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= n) break;

            int start = i;

            // move to end of word
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            // append reversed word
            for (int j = end; j >= start; j--) {
                result.append(s.charAt(j));
            }

            // append space if more words remain
            result.append(' ');
        }

        // remove trailing space
        result.setLength(result.length() - 1);
        return result.toString();
    }
}

