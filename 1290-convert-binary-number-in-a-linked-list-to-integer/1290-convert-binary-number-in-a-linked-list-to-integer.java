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
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        int result = 0;
        // StringBuilder s = new StringBuilder();

        while(current !=null){
            result = result * 2 + (current.val);
            // s.append(current.val);
            current = current.next;
        }

        // for(int i=0;i<s.length();i++){
        //     result = result * 2 + (s.charAt(i) - '0');
        // }

        return result;


    }
}