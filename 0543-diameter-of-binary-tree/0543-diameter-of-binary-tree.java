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
    int max = Integer.MIN_VALUE;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
         max = Math.max(max , lh + rh);
      
        
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        
        return max;
    }
    
     int height(TreeNode node)
    {
        if(node == null)
        return 0;
        
        int l = height(node.left);
        int r = height(node.right);
        
        return Math.max(l,r)+1;
        
    }
}