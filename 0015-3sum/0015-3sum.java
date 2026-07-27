class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> l = new HashSet<>();
        for(int i=0;i<n-2;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int t=-(nums[i]+nums[j]);
                if(hs.contains(t)){
                    l.add(Arrays.asList(nums[i], t, nums[j]));
                }
                hs.add(nums[j]);
            }
        }return new ArrayList<>(l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna