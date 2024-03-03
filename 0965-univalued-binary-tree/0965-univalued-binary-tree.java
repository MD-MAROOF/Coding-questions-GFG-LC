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
    public boolean isUnivalTree(TreeNode root) {
        
        int uni_value = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            
            if(queue.peek().val != uni_value)
                return false;
            
            if(queue.peek().left != null)
                queue.add(queue.peek().left);
            
            if(queue.peek().right != null)
                queue.add(queue.peek().right);
            
            queue.poll();
        }
        
        return true;
    }
}