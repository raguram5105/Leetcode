class Solution {
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int[] pr=new int[n];
        int[] su=new int[n];
        pr[0]=arr[0];
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]+arr[i];
        }
        su[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            su[i]=su[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(pr[i]==su[i]){
                return i;
            }
        }
        return -1;
        
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna