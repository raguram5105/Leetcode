class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int n:nums){
            l.add(n);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!l.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna