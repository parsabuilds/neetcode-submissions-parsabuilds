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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 

        while (fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
    }
}


// Create ListNodes slow and fast 
// slow moves one node at a time, fast moves 2 nodes at a time
// when fast or fast.next becomes null, slow has reached the middle 
// return slow 