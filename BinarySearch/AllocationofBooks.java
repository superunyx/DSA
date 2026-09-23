class Solution {
    public boolean possible(int[] arr, long guess, int k) {
        int student = 1;
        long pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= guess) {
                pages += arr[i];
            }
            else {
                student++;
                pages = arr[i];
                if (student > k) {
                    return false;
                }
            }
        }
        return true;
    }
    public long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public int maxelement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public int findPages(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }
        long low = maxelement(arr);
        long high = sum(arr);
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (possible(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }
}
