class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            arr[i]=arr[i]+arr[n-i-1]-(arr[n-i-1]=arr[i]);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna