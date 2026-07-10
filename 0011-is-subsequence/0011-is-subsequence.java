class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, n = s.length();

        for (char c : t.toCharArray()) {
            if (i < n && s.charAt(i) == c) {
                i++;
            }
        }

        return i == n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna