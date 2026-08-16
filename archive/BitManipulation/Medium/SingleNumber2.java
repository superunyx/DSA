// // 137. Single Number 
// Given an integer array nums where every element appears three times except for one,
// which appears exactly once. Find the single element and return it.
//
// You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//



class Solution {
    public int singleNumber(int[] nums) {

        // 'ones' stores bits that have appeared exactly ONCE (mod 3)
        int ones = 0;

        // 'twos' stores bits that have appeared exactly TWICE (mod 3)
        int twos = 0;

        // Process every number in the array
        for (int i = 0; i < nums.length; i++) {

            /*
             * Step 1: Update 'ones'
             * - XOR (^) toggles bits when nums[i] is seen
             * - & (~twos) removes bits that have already appeared twice
             *   (a bit cannot be in both 'ones' and 'twos')
             */
            ones = (ones ^ nums[i]) & (~twos);

            /*
             * Step 2: Update 'twos'
             * - XOR (^) toggles bits when nums[i] is seen the second time
             * - & (~ones) removes bits that have been reset back to 'ones'
             */
            twos = (twos ^ nums[i]) & (~ones);
        }

        /*
         * After processing all numbers:
         * - Bits that appeared 3 times are removed from both 'ones' and 'twos'
         * - Bits that appeared exactly once remain in 'ones'
         */
        return ones;
    }
}

// approach 2 
//
// sort and check from index 1 and go ahead 3 steps 
//
//nlogn + n/3


//approach 3 
//
//
//check each index if multiple of three or not 
//
//O(32N)
