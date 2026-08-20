class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] a1=new int[n];
        int[] a2=new int[n];
        a1[0]=nums[0];
        a2[0]=nums[1];
        int h=0,q=0;
        for(int i=2;i<n;i++){
            if(a1[h]>a2[q]){
                a1[++h]=nums[i];
            }else{
                a2[++q]=nums[i];
            }
        }
        int j=0;
        for(int i=0;i<=h;i++){
            nums[j++]=a1[i];
        }
        for(int i=0;i<=q;i++){
            nums[j++]=a2[i];
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna