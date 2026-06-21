class Solution {
    public int maxIceCream(int[] co, int c) {
        int h=0;
        Arrays.sort(co);
        int n=co.length;
        for(int i=0;i<n;i++){
            if(co[i]<=c){
                h++;
                c-=co[i];
            }
        }return h;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna