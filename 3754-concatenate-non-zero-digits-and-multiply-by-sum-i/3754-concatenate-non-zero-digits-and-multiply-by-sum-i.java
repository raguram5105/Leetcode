class Solution {
    public long sumAndMultiply(int n) {
        long h=0,s=0;
        for(char c:String.valueOf(n).toCharArray()){
            if(c!='0'){
                h=h*10+c-'0';
                s+=c-'0';
            }
        }
        return h*s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna