class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[ind]){
                    ind=j;
                }
            }
            arr[i]=arr[i]+arr[ind]-(arr[ind]=arr[i]);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna