class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j=0,mxl=0,n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                mxl=Math.max(mxl,i-j+1);
            }
        }return mxl; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna