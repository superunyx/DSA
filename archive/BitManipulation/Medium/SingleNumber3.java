
class Solution {
    public int[] singleNumber(int[] nums) {

        // Will hold XOR of all elements
        // Duplicate numbers cancel out, leaving XOR of the two unique numbers
        int xor = 0;

        // These will store the two single (unique) numbers
        int b1 = 0;
        int b2 = 0;

        // Step 1: XOR all numbers
        // Since a ^ a = 0 and a ^ 0 = a,
        // all duplicate numbers cancel out
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        // After this loop:
        // xor = unique1 ^ unique2

        // Step 2: Find the rightmost set bit of xor
        // (xor ^ (xor - 1)) flips all bits after the rightmost set bit
        // AND with xor isolates that rightmost set bit
        int rightmost = (xor ^ (xor - 1)) & xor;

        // Step 3: Divide numbers into two groups based on the rightmost set bit
        // One unique number will have this bit set, the other will not
        for (int i = 0; i < nums.length; i++) {

            // If the rightmost bit is set in nums[i],
            // XOR it into the first bucket
            if ((nums[i] & rightmost) != 0) {
                b1 = b1 ^ nums[i];
            }
            // Otherwise XOR it into the second bucket
            else {
                b2 = b2 ^ nums[i];
            }
        }

        // b1 and b2 now contain the two unique numbers
        return new int[]{b1, b2};
    }
}
