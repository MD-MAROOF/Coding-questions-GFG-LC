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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int j=1,index = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int sum = 0;
            for(int i=0;i<size;i++)
            {
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                   
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
    
                }
                
                sum = sum + queue.peek().val;
                
                queue.poll();
            }
            
            
            if(sum > max){
                max = sum;
                index = j;
            }
            j++;
        
        }
        
        return index;
    }
}