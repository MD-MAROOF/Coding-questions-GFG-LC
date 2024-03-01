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
    Integer prev = null;
      int MIN = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
      
        inorder(root);
        return MIN;
    }
    
    private void inorder(TreeNode root)
    {
        if(root == null)
            return;
        
        inorder(root.left);
        
        if(prev != null)
            MIN = Math.min(MIN,Math.abs(root.val - prev));
        
        prev  = root.val;
        
        inorder(root.right);
    }
}