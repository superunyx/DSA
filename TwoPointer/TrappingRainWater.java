class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if (n < 3) {
            return 0;
        }

        int maxleft = height[0];
        int maxright = height[n - 1];

        int left = 0;
        int right = n - 1;

        int ans = 0;

        while (left < right) {
            if (maxleft <= maxright) {
                left++;

                if (height[left] > maxleft) {
                    maxleft = height[left];
                }
                else {
                    ans += maxleft - height[left];
                }
            }
            else {
                right--;

                if (height[right] > maxright) {
                    maxright = height[right];
                }
                else {
                    ans += maxright - height[right];
                }
            }
        }

        return ans;
    }
}
