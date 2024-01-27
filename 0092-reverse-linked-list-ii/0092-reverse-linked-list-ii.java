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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        
        
       while(temp != null)
       {
           list.add(temp.val);
           temp=temp.next;
       }
        
        reverse(list,left,right);
        
        ListNode front = head;
        
        int i = 0;
        while(i < list.size())
        {
            front.val = list.get(i);
            i++;
            front = front.next;
        }
        
        return head;
        
    }
    
    public ArrayList<Integer> reverse(ArrayList<Integer> arr, int l, int r)
    {
      int left = l-1;
      int right = r-1;
        
        while(left < right)
        {
             int swap = arr.get(left);
        arr.set(left, arr.get(right));
        arr.set(right, swap);
            
            left++;
            right--;
        }
        
        return arr;
    }
}