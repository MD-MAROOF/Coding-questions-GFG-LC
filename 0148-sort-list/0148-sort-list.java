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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
        
        //finding the middle of linked list using tortoise hare approach
        
        while(fast != null && fast.next != null)
        {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;   //breaking the list into 2 halves
        
        ListNode node1 = sortList(head);
        ListNode node2 = sortList(slow);
        
        return mergeList(node1,node2);
        
    }
    
    ListNode mergeList(ListNode head1, ListNode head2)
    {
        ListNode fh = null;
        ListNode ft = null;
        
        while(head1 != null && head2 != null)
        {
            if(fh == null && ft == null)
            {
                if(head1.val > head2.val)
                {
                    fh=head2;
                    ft = head2;
                    head2 = head2.next;
                }
                
                else{
                    fh = head1;
                    ft = head1;
                    head1 = head1.next;
                }
            }
            
            if(head1 != null && head2 !=null)
            {
                if(head1.val < head2.val)
                {
                    ft.next = head1;
                    ft = ft.next;
                    head1 = head1.next;
                }
                
                else{
                    ft.next = head2;
                    ft = ft.next;
                    head2 = head2.next;
                }
            }
        }
        
        if(head1 != null)
            ft.next = head1;
        
        if(head2 != null)
            ft.next = head2;
        
        return fh;
    }
    
}