class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                ans=Math.max(ans,p);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna