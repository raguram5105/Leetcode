class Solution {
    public int singleNumber(int[] a) {
        int n=0;
        for(int i=0;i<a.length;i++){
            n^=a[i];
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna