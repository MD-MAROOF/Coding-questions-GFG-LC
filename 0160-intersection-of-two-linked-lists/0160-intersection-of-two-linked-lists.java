/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headA != null)
        {
            ListNode b = headB;
            while(b != null)
            {
                if(b == headA)
                    return b;
                    
                b = b.next;
            }
            headA = headA.next;
        }
        
        return null;
    }
}