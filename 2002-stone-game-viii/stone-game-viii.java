class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        // prefix sum
        int[] prefix = new int[n];
        prefix[0] = stones[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        // Start with the move that takes all stones
        int ans = prefix[n - 1];

        // Try every possible first stopping position
        for (int i = n - 2; i >= 1; i--) {
            ans = Math.max(ans, prefix[i] - ans);
        }

        return ans;
    }
}