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



/*Find the middle of the linked list. For Example:-
1->2->3->4->5
Here, middle =3;
Then reverse the second half of the Linked List (i.e. 4->5), so after reversing the list will be like 5->4
Now, merege both list in ordered way like one element of 1st half linkedlist (i.e 1->2->3) and one element of second half list (i.e 5->4) so after merging the list will be like:-
1->5->2->4->3
which is the required answer.
*/
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode newNode = reverseList(slow.next);
        
        slow.next = null;
        
        ListNode curr = head;
        ListNode dummy = newNode;
        
        while(curr != null && dummy != null)
        {
            ListNode temp = curr.next;
            curr.next = dummy;
            
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            
            curr = temp;
            dummy = temp2;
        }
    }
    
    public ListNode reverseList(ListNode node)
    {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}