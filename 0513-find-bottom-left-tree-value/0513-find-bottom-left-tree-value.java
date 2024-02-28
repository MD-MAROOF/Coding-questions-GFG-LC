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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        int last = 0;
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
     
            int size = queue.size();
            
            for(int i=0;i<size;i++)
            {
             
                if(i == 0)
                    last = queue.peek().val;
                
                if(queue.peek().left != null)
                    queue.add(queue.peek().left);
                
                if(queue.peek().right != null)
                    queue.add(queue.peek().right);
                
                queue.poll();
            }
        }
        
        return last;
    }
}