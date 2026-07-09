class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] h=new int[n];
        int[] r=new int[n];
        int[] b=new int[n];
        int p1=1,p2=1;
        for(int i=0;i<n;i++){
            h[i]=p1;
            if(i!=n-1)p1*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            r[i]=p2;
            if(i!=0)p2*=nums[i];
        }
        for(int i=0;i<n;i++){
            b[i]=r[i]*h[i];
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna