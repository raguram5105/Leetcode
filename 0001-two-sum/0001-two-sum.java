class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> hm=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            int h=t-a[i];
            if(hm.containsKey(h)){
                return new int[]{hm.getOrDefault(h,0),i};
            }
            hm.put(a[i],i);
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna