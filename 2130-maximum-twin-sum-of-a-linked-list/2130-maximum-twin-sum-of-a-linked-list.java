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
class Solution {
    public int pairSum(ListNode head) {
        
        Stack<ListNode> stk = new Stack<>();
        
        ListNode temp  = head;
        while(temp != null)
        {
            stk.push(temp);
            temp = temp.next;
        }
        
        int max = Integer.MIN_VALUE;
        
        while(stk.size() > stk.size()/2)
        {
            max = Math.max(max,head.val + stk.pop().val);
            head = head.next;
        }
        
        return max;
        
    }
}