class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=0)return 0;
        int l=0,c=0;
        long p=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[l];
                l++;
            }
            c+=(i-l+1);
        }
        return c;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna