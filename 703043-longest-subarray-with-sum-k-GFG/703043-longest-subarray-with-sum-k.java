// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int s=0,ma=0;
        int n=arr.length;
        m.put(0,0);
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(m.containsKey(s-k)){
                ma=Math.max(ma,i-m.get(s-k)+1);
            }
            if(!m.containsKey(s)){
                m.put(s,i+1);
            }
        }
        return ma;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna