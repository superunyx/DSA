class Solution {

    public int maximumSum(int[] arr) {

        // Best subarray sum ending at current index with no deletion
        int nodelete = arr[0];

        // Deletion is considered used before the array starts,
        // allowing us to delete the first element
        int onedelete = 0;

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend the previous subarray or start fresh
            int newNodelete = Math.max(nodelete + arr[i], arr[i]);

            // Either deletion happened earlier and we keep current,
            // or we delete the current element
            int newOneDelete = Math.max(
                onedelete + arr[i],
                nodelete
            );

            nodelete = newNodelete;
            onedelete = newOneDelete;

            // Best answer can come from either state
            ans = Math.max(ans, Math.max(nodelete, onedelete));
        }

        return ans;
    }
}
