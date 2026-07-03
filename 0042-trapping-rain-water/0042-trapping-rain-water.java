class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1,lm=h[l],rm=h[r];
        int w=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,h[l]);
                w+=lm-h[l];
            }else{
                r--;
                rm=Math.max(rm,h[r]);
                w+=rm-h[r];
            }
        }
        return w;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna