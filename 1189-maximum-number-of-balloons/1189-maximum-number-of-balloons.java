class Solution {
    public int maxNumberOfBalloons(String t) {
        int[] f=new int[26];
        for(char c:t.toCharArray()){
            f[c-'a']++;
        }
        f['l'-'a']/=2;
        f['o'-'a']/=2;
        int mi=f['b'-'a'];
        mi=Math.min(mi,f['a'-'a']);
        mi=Math.min(mi,f['l'-'a']);
        mi=Math.min(mi,f['o'-'a']);
        mi=Math.min(mi,f['n'-'a']);
        return mi;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna