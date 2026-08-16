
class Solution {
    public int divide(int dividend, int divisor) {

        // Only overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long add = 0;

        while (n >= d) {
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            add += 1L << count;
            n -= d << count;
        }

        return sign ? (int) add : (int) -add;
    }
}
