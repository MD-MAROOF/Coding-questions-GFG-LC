/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        
        if(head == null)
            return true;
        
        if(root == null)
            return false;
        
        if(dfs(head,root))   //This checks if the entire list is present in the tree or not
            return true;
        
        return isSubPath(head,root.left) || isSubPath(head,root.right);
        
    }
    
    boolean dfs(ListNode head, TreeNode node)
    {
        if(head == null)
            return true;
        
        if(node == null)
            return false;
        
        if(node.val != head.val)
            return false;
        
        return dfs(head.next,node.left) || dfs(head.next,node.right);
    }
}