class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int min=a[0];
        int p=0;
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
            if((a[i]-min)>p){
                p=a[i]-min;
            }
        }
        return p;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna