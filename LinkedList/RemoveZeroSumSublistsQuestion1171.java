import java.util.*;

public class RemoveZeroSumSublistsQuestion1171 {
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

    public ListNode removeZeroSumSublists(ListNode head) {
        int prifixSum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);

        while (head != null) {
            prifixSum += head.val;

            if (map.containsKey(prifixSum)) {
                ListNode p = map.get(prifixSum);
                ListNode start = p;
                int pSum = prifixSum;

                while (start != head) {
                    start = start.next;
                    pSum += start.val;
                    if (start != head) {
                        map.remove(pSum);
                    }
                }
                p.next = start.next;
            } else {
                map.put(prifixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}
