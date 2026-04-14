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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // base cases 
        if (list1 == null) return list2; 
        if (list2 == null) return list1; 

        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            // compare the two nodes 
            if (list1.val < list2.val) {
                current.next = list1; 
                list1 = list1.next; 
                current = current.next; 
            } else {
                current.next = list2; 
                list2 = list2.next; 
                current = current.next; 
            }
        }

        if (list1 != null) {
            current.next = list1; 
        } else {
            current.next = list2; 
        }
        
        // return head of new sorted list 
        return dummy.next; 
    }
}


/* 
Base case: 
if one of them is empty, just return the other one (covers the case where both are empty)

We can either create a new list and start adding nodes to it or 
we can just change the pointers of the two lists to point at each other's nodes 
The second approach is more space efficient O(1) 

Algorithm: 
compare the heads of both lists 
    If they are the same, point the first one to the second one 
    if not, point the smaller one to the larger one 

Pseudocode: 
if (list1 == null) return list2; 
if (list2 == null) return list1; 

ListNode dummy = list1; 
ListNode current = 
while (current != null) {
    
    current = current.next; 
}
*/