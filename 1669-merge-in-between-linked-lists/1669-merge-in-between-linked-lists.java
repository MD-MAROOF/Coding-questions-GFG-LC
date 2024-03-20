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
        
        ListNode temp = list1;
        
        for(int i=0;i<a-1;i++)
        {
            temp = temp.next;
        }
        
       ListNode list2_next = list1;
        
        for(int i=0;i<=b;i++)
        {
            list2_next = list2_next.next;
        }
        
        temp.next = null;
        temp.next = list2;
        
        ListNode temp1 = list2;
        while(temp1.next != null)
        {
            temp1 = temp1.next;
        }
        
    //    list2_next.next = temp1;
        temp1.next = list2_next;
        
        return list1;
    }
}