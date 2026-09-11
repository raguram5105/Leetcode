/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean isequa(TreeNode root){
        int sum=0;
        int c=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            sum+=n.val;
            c++;
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
        }
        int v=sum/c;
        return v==root.val;

    }
    public int averageOfSubtree(TreeNode root) {
        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            if(isequa(n)){
                count++;
            }
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna