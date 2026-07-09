class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        List<Boolean> b=new ArrayList<>();
        int mx=Integer.MIN_VALUE;
        for(int i:c){
            mx=Math.max(mx,i);
        }
        for(int i:c){
            if(i+ec>=mx){
                b.add(true);
            }else{
                b.add(false);
            }
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna