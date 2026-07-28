class Solution {
    public int maxSubArray(int[] a) {
        int n=a.length;
        int msf=a[0];
        int meh=a[0];
        for(int i=1;i<n;i++){
            meh=Math.max(a[i],a[i]+meh);
            msf=Math.max(msf,meh);
        }
        return msf;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna