class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than last element, 
            // minimum must be in the right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            // Otherwise, minimum is in the left half (including mid)
            else {
                high = mid;
            }
        }

        // When loop ends, low == high and points to the smallest element
        return nums[low];
    }
}