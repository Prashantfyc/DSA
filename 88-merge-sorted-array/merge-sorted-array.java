class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last valid element in nums1
        int i = m - 1;

        // Pointer for last element in nums2
        int j = n - 1;

        // Position where we will place the largest element
        int k = m + n - 1;

        // Compare from the end
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements of nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}