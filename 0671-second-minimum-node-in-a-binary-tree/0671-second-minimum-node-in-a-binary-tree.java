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
    public int findSecondMinimumValue(TreeNode root) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        solve(root,set);
        
        set.pollFirst();
        
        if(!set.isEmpty())
        return set.first();
        
        return -1;
    }
    
    void solve(TreeNode node, TreeSet<Integer> set)
    {
        if(node != null)
        {
            set.add(node.val);
            solve(node.left,set);
            solve(node.right,set);
        }
    }
}