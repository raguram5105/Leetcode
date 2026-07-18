class Solution {
    public int findGCD(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for(int n:nums){
            mi=Math.min(mi,n);
            mx=Math.max(mx,n);
        }
        while(mi!=0) {
            int t=mi;
            mi=mx%mi;
            mx=t;
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna