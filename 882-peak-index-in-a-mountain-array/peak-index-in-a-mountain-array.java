class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are in the ascending part → move right
                start = mid + 1;
            } else {
                // We are in the descending part → move left (mid could still be peak)
                end = mid;
            }
        }
        // start == end → peak index
        return start;
    }
}