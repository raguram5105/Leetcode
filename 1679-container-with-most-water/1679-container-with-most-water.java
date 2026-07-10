class Solution {
    public int maxArea(int[] h){
        int l=0,r=h.length-1;
        int mx=0;
        while(l<r){
            int w=r-l;
            int mh=Math.min(h[l],h[r]);
            mx=Math.max(mx,w*mh);
            if(h[l]>h[r]){
                r--;
            }else{
                l++;
            }
        }
        return mx;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna