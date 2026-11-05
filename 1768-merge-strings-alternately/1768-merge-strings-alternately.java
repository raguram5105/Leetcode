class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0,j=0;
        int n=w1.length(),m=w2.length();
        String r="";
        while(i<n && j<m){
            r+=w1.charAt(i++);
            r+=w2.charAt(j++);
        }
        while(i<n){
            r+=w1.charAt(i++);
        }
        while(j<m){
            r+=w2.charAt(j++);
        }
        return r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna