class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] l=new int[n];
        int[] r=new int[n];
        int t=0;
        int mx=-1;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,h[i]);
            l[t++]=mx;
        }
        t=n-1;
        int sum=0;
        mx=-1;
        for(int i=n-1;i>=0;i--){
            mx=Math.max(mx,h[i]);
            r[t--]=mx;
        }
        for(int i=0;i<n;i++){
            sum+=(Math.min(l[i],r[i])-h[i]);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna