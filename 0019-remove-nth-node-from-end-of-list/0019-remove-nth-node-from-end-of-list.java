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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode length = head;
        int count = 0;
        
        
        
        while(length != null)
        {
            count++;
            length = length.next;
        }
        
        if(count == 1)
            return null;
        if(count == n)
        {
            head = head.next;
            return head;
        }
        
        ListNode temp = head;
       for(int i=0;i<count-n-1;i++)
       {
          temp = temp.next; 
       }
        
        temp.next = temp.next.next;
        return head;
    }
}