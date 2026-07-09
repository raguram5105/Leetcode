class Solution {
    public static boolean isv(char c){
        c=Character.toLowerCase(c);
        return c=='a'|| c=='e' || c=='i' || c=='o' || c=='u';
    }
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<j){
            while(i<j && !isv(ch[i])){
                i++;
            }
            while(i<j && !isv(ch[j])){
                j--;
            }
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
        return new String(ch);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna