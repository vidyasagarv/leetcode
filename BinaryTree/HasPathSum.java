/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class HasPathSum {

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
        return false;
        else if(root.left==null && root.right==null){
            if(root.val == sum)
            return true;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}