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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1)
        {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        depth--;
        queue.offer(root);
        int level = 1;
        
        while(level != depth)
        {
            int n = queue.size();
            level++;
            
            for(int i=0;i<n;i++)
            {
                TreeNode temp = queue.poll();
                if(temp.left != null)
                    queue.offer(temp.left);
                
                if(temp.right != null)
                    queue.offer(temp.right);
            }
        }
        
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            TreeNode leftChild = temp.left;
            TreeNode rightChild = temp.right;
            
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);
            
            temp.left = newLeft;
            temp.right = newRight;
            
            newLeft.left = leftChild;
            newRight.right = rightChild;
        }
        
        return root;
    }
}