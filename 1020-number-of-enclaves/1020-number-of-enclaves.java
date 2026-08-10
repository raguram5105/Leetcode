class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && (i==0 || j==0 || i==n-1|| j==m-1)){
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;
                }
            }
        }
        while(!q.isEmpty()){
            int[] no=q.poll();
            int x=no[0];
            int y=no[1];
            for(int[] d:dir){
                int dx=x+d[0];
                int dy=y+d[1];
                if(dx>=0 && dx<n && dy>=0 && dy<m && grid[dx][dy]==1){
                    q.offer(new int[]{dx,dy});
                    grid[dx][dy]=0;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    c++;
                }
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna