class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0,r=nums.length-1,c=0;
        Arrays.sort(nums);
        while(l<r){
            if(nums[l]+nums[r]==k){
                c++;
                l++;
                r--;
            }else if(nums[l]+nums[r]>k){
                r--;
            }else{
                l++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna