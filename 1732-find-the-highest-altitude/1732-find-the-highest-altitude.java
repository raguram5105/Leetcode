class Solution {
    public int largestAltitude(int[] g) {
        int n=g.length;
        for(int i=1;i<n;i++){
            g[i]+=g[i-1];
        }
        int mx=g[0];
        for(int i=1;i<n;i++){
            mx=Math.max(mx,g[i]);
        }
        return Math.max(0,mx);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna