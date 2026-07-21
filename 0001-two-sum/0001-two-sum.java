class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            int r=t-a[i];
            if(m.containsKey(r)){
                return new int[]{m.get(r),i};
            }m.put(a[i],i);
        }
        return new int[]{};
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna