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
   int ret = 0;
    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return ret;
    }
    private void helper(TreeNode curr, int min, int max){
        if(curr != null){
            ret = Math.max(ret, Math.abs(min - curr.val));
            ret = Math.max(ret, Math.abs(max - curr.val));
            if(curr.left != null)
                helper(curr.left, Math.min(min, curr.left.val), Math.max(max, curr.left.val));
            if(curr.right != null)
                helper(curr.right, Math.min(min, curr.right.val), Math.max(max, curr.right.val));
        }
    }
}