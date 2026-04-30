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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        int temp=0;
        ListNode current = head.next;
        ListNode prev = head;


        while(current!=null){

            temp = current.val;
            current.val = prev.val;
            prev.val = temp;
            if(prev.next.next == null){
                return head;
            }

            prev = current.next;
            current = current.next.next;

        }

        return head;
    }
}