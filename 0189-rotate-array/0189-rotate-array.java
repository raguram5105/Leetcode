class Solution {
    public static void rev(int[] a,int l,int r){
        while(l<r){
            a[l]=a[l]+a[r]-(a[r]=a[l]);
            l++;
            r--;
        }
    }
    
    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        rev(a,0,n-1);
        rev(a,0,k-1);
        rev(a,k,n-1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna