class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Ascending slope → peak lies to the right
                start = mid + 1;
            } else {
                // Descending slope or peak → move left
                end = mid;
            }
        }
        return start; // or end (both are same here)
    }
}