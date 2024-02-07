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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
           Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            List<Integer> subList = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++)
            {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                
                subList.add(queue.poll().val);
                
            }
            ans.add(0,subList);
        }
        
        return ans;
    }
}