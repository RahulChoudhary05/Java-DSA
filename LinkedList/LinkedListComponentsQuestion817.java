package LinkedList;

import java.util.*;

class LinkedListComponentsQuestion817 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> map = new HashSet<>();

        for (int i : nums) {
            map.add(i);
        }
        int count = 0;
        boolean current = false;
        ListNode temp = head;
        while (temp != null) {
            if (map.contains(temp.val)) {
                if (!current) {
                    count++;
                    current = true;
                }
            } else {
                current = false;
            }
            temp = temp.next;
        }
        return count;
    }
}