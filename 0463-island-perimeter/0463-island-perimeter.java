class Solution {
    public int islandPerimeter(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        int t=0;
        while(!q.isEmpty()){
            int[] no=q.poll();
            int x=no[0];
            int y=no[1];
            int c=4;
            for(int[] d:dir){
                int dx=x+d[0];
                int dy=y+d[1];
                if(dx>=0 && dx<n && dy>=0 && dy<m && g[dx][dy]==1){
                    c--;
                }
            }
            t+=c;
        }return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna