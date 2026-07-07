class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double as=0;
        for(int i=0;i<k;i++){
            as+=nums[i];
        }
        double ma=as/k;
        for(int i=k;i<nums.length;i++){
            as=as-nums[i-k]+nums[i];
            ma=Math.max(ma,as/k);
        }
        return ma;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna