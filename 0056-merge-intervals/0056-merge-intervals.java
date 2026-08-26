class Solution {
    public int[][] merge(int[][] intv) {
        int n=intv.length;
        Arrays.sort(intv,(a,b)-> a[0]-b[0]);
        int st=intv[0][0];
        int en=intv[0][1];
        List<int[]> l=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(intv[i][0]<=en){
                en=Math.max(en,intv[i][1]);
            }else{
                l.add(new int[]{st,en});
                st=intv[i][0];
                en=intv[i][1];
            }
        }l.add(new int[]{st,en});
        return l.toArray(new int[l.size()][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna