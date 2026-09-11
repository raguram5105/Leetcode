class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            int d=fun(n.left)-fun(n.right);
            if(d>1 || d<-1)return false;
            if(n.left!=null){
                q.offer(n.left);
            } 
            if(n.right!=null){
                q.offer(n.right);
            }
        }return true;
    }
    public static int fun(TreeNode n){
        if(n==null)return 0;
        return 1+Math.max(fun(n.left),fun(n.right));
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna