/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeLevelOrderTraversal {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currValues = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> currQueue = new LinkedList<>();
        Queue<TreeNode> nextQueue = new LinkedList<>();
        currQueue.offer(root);
        while(!currQueue.isEmpty()){
            TreeNode node = currQueue.poll();
            currValues.add(node.val);
            if(node.left != null){
                nextQueue.offer(node.left);
            }
            if(node.right != null){
                nextQueue.offer(node.right);
            }
            if(currQueue.isEmpty()){
                currQueue = nextQueue;
                nextQueue = new LinkedList<>();
                list.add(currValues);
                currValues = new ArrayList<>();
            }
        }
        return list;
    }
}