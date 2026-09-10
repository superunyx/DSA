class Solution {

    public int findMaxLength(int[] nums) {

        // Stores the FIRST index where each difference appeared.
        // We keep the first index because it gives the longest subarray.
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        // Maximum length found so far
        int res = 0;

        int one = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {

            // Count zeros and ones
            if (nums[i] == 0) {
                zero++;
            }
            else {
                one++;
            }

            // Difference between number of zeros and ones
            // If the same difference appears again,
            // the elements between those two positions have
            // equal numbers of 0s and 1s.
            int diff = zero - one;

            // If diff is 0, then from index 0 to i
            // there are already equal zeros and ones.
            if (diff == 0) {
                res = Math.max(res, i + 1);
                continue;
            }

            // We have seen this difference before.
            // The part between the previous index and i
            // has equal numbers of 0s and 1s.
            if (map.containsKey(diff)) {

                int index = map.get(diff);

                // Length of subarray from index + 1 to i
                int len = i - index;

                res = Math.max(res, len);
            }

            // First time seeing this difference.
            // Store its index.
            else {
                map.put(diff, i);
            }
        }

        return res;
    }
}
