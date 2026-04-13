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
        if (head == null) return head; 
        ListNode current = head; 
        // stack to store LinkedList elemnts in opposite order 
        Deque<ListNode> stack = new ArrayDeque<>(); 

        while (current != null) {
            stack.push(current); 
            current = current.next; 
        }

        // Loop through the stack and add every element to a new LinkedList
        ListNode newHead = stack.pop(); 
        ListNode curr = newHead; 
        while (!stack.isEmpty()) {
            curr.next = stack.pop(); 
            curr = curr.next;
        }
        curr.next = null;
        return newHead; 
    }
}
    
// This solution works but it's O(n) space complexity because of the stack
// The better approach is to reverse the pointers in place which makes it O(1)