class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();

        recursion(s, 0, current, ans);

        return ans;
    }

    void recursion(String s, int index,
                   List<String> current,
                   List<List<String>> ans) {

        if (index == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            String part = s.substring(index, i + 1);

            if (!isPalindrome(part)) {
                continue;
            }

            current.add(part);

            recursion(s, i + 1, current, ans);

            current.remove(current.size() - 1);
        }
    }

    boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}