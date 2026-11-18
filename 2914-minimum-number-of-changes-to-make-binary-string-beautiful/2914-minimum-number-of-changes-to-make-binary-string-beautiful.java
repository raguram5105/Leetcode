class Solution {
    public int minChanges(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                c++;
            }
        }return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna