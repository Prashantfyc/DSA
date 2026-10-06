class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);

        recursion(ans, current, target, candidates, 0, 0);

        return ans;
    }

    void recursion(
        List<List<Integer>> ans,
        List<Integer> current,
        int target,
        int[] candidates,
        int sum,
        int index
    ) {

        if (sum == target) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Duplicate choice skip
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);

            recursion(
                ans,
                current,
                target,
                candidates,
                sum + candidates[i],
                i + 1
            );

            current.remove(current.size() - 1);
        }
    }
}