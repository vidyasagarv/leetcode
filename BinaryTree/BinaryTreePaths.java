/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePaths {
    List<String> result = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();
    
    public List<String> binaryTreePaths(TreeNode node) {
        int currLen = sb.length();
        if(node == null){
            return result;
        }
        if(node.left == null && node.right == null){
            sb.append(node.val);
            result.add(sb.toString());
            sb.delete(currLen, sb.length());
        }
        if(node.left != null){
            sb.append(node.val);
            sb.append("->");
            binaryTreePaths(node.left);
            sb.delete(currLen, sb.length());
        }
        if(node.right != null){
            sb.append(node.val);
            sb.append("->");
            binaryTreePaths(node.right);
            sb.delete(currLen, sb.length());
        }
        return result;
    }
}