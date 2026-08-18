class Solution {
    public int singleNumber(int[] a) {
        int v=0;
        for(int n:a){
            v^=n;
        }
        return v;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna