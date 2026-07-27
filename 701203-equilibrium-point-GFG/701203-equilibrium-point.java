class Solution {
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int[] pr=new int[n];
        int[] su=new int[n];
        pr[0]=arr[0];
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]+arr[i];
        }
        int s=pr[n-1];
        for(int i=0;i<n;i++){
            if((pr[i]-arr[i])==(s-pr[i])){
                return i;
            }
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna