class Solution {
    public int maximumLength(int[] nums) {
        int n=nums[0]%2, o=0,e=0,b=0;
        for(int i:nums){
            if(i%2==0){
                e++;
            }else{
                o++;
            }
            if(i%2==n){
                b++;
                n=1-n;
            }
        }
        return Math.max(b,Math.max(e,o));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna