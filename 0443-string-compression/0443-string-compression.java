class Solution {
    public int compress(char[] ch) {
        int n=ch.length;
        String s="";
        for(int i=0;i<n;i++){
            int c=1;
            while(i+1<n && ch[i+1]==ch[i]){
                c++;
                i++;
            }
            s+=ch[i];
            if (c > 1) {
                s += String.valueOf(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return s.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna