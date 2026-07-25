class Solution {
    public int maxProduct(int n) {
        String s=n+"";
        int mx=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                mx=Math.max(mx,(s.charAt(i)-'0')*(s.charAt(j)-'0'));
            }
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna