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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        queue.offer(root);
        int j = 0;
        while(!queue.isEmpty())
        {
            int n = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            
            for(int i=0;i<n;i++)
            {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                
                subList.add(queue.poll().val);
             
            }
            
            if((j&1)==0){
        ans.add(subList);
      }
      else{
        Collections.reverse(subList);
        ans.add(subList);
      }
      j++;
            
        }
        
        return ans;
    }
}