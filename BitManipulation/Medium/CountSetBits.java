//optimized logn
class Solution {
    public static int countSetBits(int n) {
        int total = 0;

        // loop over each bit position
        for (int i = 0; (1 << i) <= n; i++) {

            // size of one full repeating block for bit i
            int blockSize = 1 << (i + 1);

            // number of complete blocks from 0 to n
            int fullBlocks = (n + 1) / blockSize;

            // each full block contributes 2^i set bits
            total += fullBlocks * (1 << i);

            // leftover part after full blocks
            int remainder = (n + 1) % blockSize;

            // extra set bits from incomplete block
            if (remainder > (1 << i)) {
                total += remainder - (1 << i);
            }
        }

        return total;
    }
}

// nlogn 
class Solution {
    public static int countSetBits(int n) {
        int total=0;
        while(n>0){
            int count=0;
            int num =n;
            while(num>0){
                num=num&(num-1);
                count++;
            }
            total+=count;
            n--;
        }
        return total;
    }
}
