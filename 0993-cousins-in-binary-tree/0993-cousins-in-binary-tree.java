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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root == null)        //THIS IS A DFS SOLUTION
            return false;
        
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode xParent = null, yParent = null;
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode head = queue.poll();
                if(head.left != null)
                {
                    queue.offer(head.left);
                    if(head.left.val == x)
                        xParent = head;
                    
                    if(head.left.val == y)
                        yParent = head;
                }
                
                if(head.right != null)
                {
                    queue.offer(head.right);
                    if(head.right.val == x)
                        xParent = head;
                    
                    if(head.right.val == y)
                        yParent = head;
                }
                
                if(xParent != null && yParent != null){
                    return xParent != yParent;
                }
            }
            
            
            if((xParent == null && yParent != null) || (xParent != null && yParent == null))
                return false;
            
        }
        return false;
    }
}