

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find common elements
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                list.add(num);

                map.put(num, map.get(num) - 1);
            }
        }

        // Step 3: Convert list to array
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}