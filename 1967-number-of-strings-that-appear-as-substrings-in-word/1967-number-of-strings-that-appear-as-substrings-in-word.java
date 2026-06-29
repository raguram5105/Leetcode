class Solution {
    public int numOfStrings(String[] p, String w) {
        int c=0;
        for(String a:p){
            if(w.contains(a)){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna