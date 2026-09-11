class Solution {
    public static List<String> l;
    public static void fun(TreeNode r,String s){
        if(r.left==null && r.right==null){
            l.add(s+""+r.val);
            return;
        }
        if(r.left!=null){
            fun(r.left,s+r.val+"->");
        }
        if(r.right!=null){
            fun(r.right,s+r.val+"->");
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        l=new ArrayList<>();
        if(root!=null)fun(root,"");
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna