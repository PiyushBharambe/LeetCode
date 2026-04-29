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
    public int size(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current!=null){
            current=current.next;
            count++;
        }

        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev = null;
        ListNode current=head;
        if(head == null || head.next == null){
            return head;
        }

        int loopSize = k % size(head);

        for(int i = 0 ; i<loopSize;i++){

            while(current.next!=null){
            prev = current;
            current=current.next;
            }

            current.next = head;
            head = current;
            prev.next = null;


        }

        return head;
        
        
    }
}