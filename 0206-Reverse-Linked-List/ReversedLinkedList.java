/* https://leetcode.com/problems/reverse-linked-list/ */

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
    public ListNode reverseList(ListNode head) {
        // head è la lista vuota
        if (head == null) {
            return null;
        }

        ListNode current = head, previous = null, next = null;

        while (current != null) {
            next = current.next;

            // Inverte tutti gli elementi 
            current.next = previous;
            previous = current;
            current = next;
        }
        // Restituisce il riferimento all'ultimo elemento non null
        return previous;
    }
}
