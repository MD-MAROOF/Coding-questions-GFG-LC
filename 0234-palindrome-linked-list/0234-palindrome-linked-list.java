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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev,next;
        
        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev = slow;
        slow = slow.next;
        prev.next  = null;
        
        while(slow != null)
        {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        
        slow = prev;
        fast = head;
        
        while(slow != null)
        {
            if(fast.val != slow.val)
            {
                return false;
            }
            
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }
}