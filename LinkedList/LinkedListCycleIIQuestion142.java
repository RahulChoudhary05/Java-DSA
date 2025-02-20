package LinkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class LinkedListCycleIIQuestion142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return null;
        }
        ListNode startChainFrom = head;
        while (startChainFrom != slow) {
            startChainFrom = startChainFrom.next;
            slow = slow.next;
        }
        return slow;
    }
}
