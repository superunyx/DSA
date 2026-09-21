class Solution {
    public int findCeil(int[] arr, int x) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                index = mid;
                high = mid - 1;
            }
        }

        return index;
    }
}
