class Solution {
    public int numberOfSubstrings(String s) {
        int[] a=new int[3];
        int l=0;
        int c=0;
        for(int r=0;r<s.length();r++) {
            a[s.charAt(r)-'a']++;
            while(a[0]>0 && a[1]>0 && a[2]>0){
                c+=s.length()-r;
                a[s.charAt(l)-'a']--;
                l++;
            }
        }return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna