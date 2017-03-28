/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class IsValidBST {
    
    public static boolean isValidBST(TreeNode root) {
        return validate(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean validate(TreeNode node, double min, double max){
        if(node == null){
            return true;
        }
        if(node.val <= min || node.val >= max){
            return false;
        }
        
        return validate(node.left,min,node.val) && validate(node.right,node.val,max);
    }
}