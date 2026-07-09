class Solution {
    public boolean increasingTriplet(int[] nums) {
        int r=Integer.MAX_VALUE;
        int h=Integer.MAX_VALUE;
        for(int i:nums){
            if(h>=i){
                h=i;
            }else if(r>=i){
                r=i;
            }else{
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna