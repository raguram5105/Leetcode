class Solution {
    public int minimumPushes(String word) {
        int a=0;
        for(int i=0;i<word.length();i++){
            a+= (i/8)+1;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna