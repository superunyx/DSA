class Solution {
    int replaceBit(int N, int K) {
        int temp = N;
        int bits = 0;

        // Step 1: count number of bits in N
        while (temp > 0) {
            bits++;
            temp >>= 1;
        }

        // Step 2: if K exceeds bit length
        if (K > bits) {
            return N;
        }

        // Step 3: convert left-based index to right-based (0-based)
        int pos = bits - K;

        // Step 4: clear the bit only if it is 1
        if ((N & (1 << pos)) != 0) {
            N = N & ~(1 << pos);
        }

        return N;
    }
}
