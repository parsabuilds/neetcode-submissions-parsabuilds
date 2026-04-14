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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            if (fast == slow) return true; 
        }
        return false; 
    }
}

/* 
General solution: fast and slow pointers -> if they meet, there is a cycle 

Algorithm: 
- declar fast and slow both at head 
- while (fast != null && slow != null) slow moves on node at a time .next while fast moves 2 nodes at a time .next.next
*/ 