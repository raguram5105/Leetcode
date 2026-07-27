class Solution {
    public int maxProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int n:nums){
            if(n>m1){
                m2=m1;
                m1=n;
            }else if(n>m2){
                m2=n;
            }
        }
        return (m1-1)*(m2-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna