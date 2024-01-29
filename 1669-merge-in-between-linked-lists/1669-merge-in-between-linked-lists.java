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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode end = list1;
        
        int b_count = 1;
        
        while(b_count <= b+1)
        {
            b_count++;
            end = end.next;
        }
        
        int a_count = 0;
        ListNode begin = list1;
        
        while(a_count < a-1)
        {
            a_count++;
            begin = begin.next;
        }
        
      begin.next = null;
        begin.next = list2;
        
        
     ListNode temp = list2;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        
        temp.next = end;
        
        return list1;
        
        
    }
}