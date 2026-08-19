class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        int val=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<val){
                i++;
                arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
            }
        }arr[i+1]=arr[i+1]+arr[high]-(arr[high]=arr[i+1]);
        return i+1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna