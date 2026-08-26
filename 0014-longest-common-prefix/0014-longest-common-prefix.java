class Solution {
    public String longestCommonPrefix(String[] st) {
        int n=st.length;
        String res="";
        int h=0;
        while(true){
            if(h>=st[0].length())break;
            char c=st[0].charAt(h);
            boolean f=true;
            for(int i=1;i<n;i++){
                if(h>=st[i].length() || st[i].charAt(h)!=c){
                    f=false;
                    break;
                }
            }
            if(f){
                res+=c;
            }
            else{
                break;
            }
            h++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna