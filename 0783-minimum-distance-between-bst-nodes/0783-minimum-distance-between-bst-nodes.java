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
    public int minDiffInBST(TreeNode root) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            if(queue.peek().left != null)
                queue.offer(queue.peek().left);
            
            if(queue.peek().right != null)
                queue.offer(queue.peek().right);
            
            arr.add(queue.poll().val);
        }
        
        Collections.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i) - arr.get(i-1) < min)
                min = arr.get(i) - arr.get(i-1);
        }
        
        return min;
    }
}