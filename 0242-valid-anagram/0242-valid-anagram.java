class Solution {
    public boolean isAnagram(String s, String t) {
        int[] fre=new int[130];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
            fre[t.charAt(i)]--;
        }
        for(int i=0;i<130;i++){
            if(fre[i]!=0){
                return false;
            }
        }
        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna