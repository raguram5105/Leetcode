class Solution {
    public void moveZeroes(int[] a) {
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
                j++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna