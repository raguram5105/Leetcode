class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        int[][] di={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.offer(new int[] {i,j});
                }
            }
        }
        int t=0;
        while(!q.isEmpty()){
            int[] no=q.poll();
            int x=no[0];
            int y=no[1];

            int c=4;
            for(int[] d:di){
                int dx=x+d[0];
                int dy=y+d[1];
                if(dx>=0 && dx<n && dy>=0 && dy<m && grid[dx][dy]==1 ){
                    c--;
                }
            }t+=c;
        }return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna