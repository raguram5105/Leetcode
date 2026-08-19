class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length(),m=t.length();
        if(n!=m)return false;
        int[] f1=new int[130];
        int[] f2=new int[130];
        for(int i=0;i<n;i++){
            if(f1[s.charAt(i)]!=f2[t.charAt(i)]){
                return false;
            }
            f1[s.charAt(i)]=i+1;
            f2[t.charAt(i)]=i+1;
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna