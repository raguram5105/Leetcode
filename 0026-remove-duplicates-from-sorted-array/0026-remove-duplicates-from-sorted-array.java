class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=a[j]){
                j++;
                a[j]=a[i]; 
            }
        }
        return j+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna