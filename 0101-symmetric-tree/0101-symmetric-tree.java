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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        
        while(!queue.isEmpty())
        {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();
            
            if(leftNode == null && rightNode == null)
                continue;
            
            if(leftNode == null || rightNode == null)
                return false;
            
            if(leftNode.val != rightNode.val)
                return false;
            
            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }
        
        return true;
        
    }
}