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
        int count=0;
        while(current!= null){
            current=current.next;
            count++;
        }

        return count;

    }
    public ListNode middleNode(ListNode head) {
        

        int mid = size(head)/2;
        int i =0;
        ListNode current = head;

        while(i<mid){
            current = current.next;
            i++;
        }

        return current;
        
    }
}