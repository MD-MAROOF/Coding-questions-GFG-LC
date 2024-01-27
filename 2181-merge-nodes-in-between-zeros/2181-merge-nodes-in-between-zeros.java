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
    public ListNode mergeNodes(ListNode head) {
        
        
        ListNode curr = head;
        ListNode temp = head;
        int sum = 0;
        
        while(curr != null){
            if(sum > 0 && curr.val == 0)
            {
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            else
                sum = sum + curr.val;
            
            curr = curr.next;
        }
        
        return head.next;
    }
}