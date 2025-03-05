import java.util.*;

public class MergekSortedListsQuestion23 {
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

    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode partitionAndMerge(int start, int end, ListNode[] lists) {
        if (start == end)
            return lists[start];
        if (start > end)
            return null;

        int mid = start + (end - start) / 2;
        ListNode l1 = partitionAndMerge(start, mid, lists);
        ListNode l2 = partitionAndMerge(mid + 1, end, lists);

        return mergeTwoSortedLists(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return partitionAndMerge(0, lists.length - 1, lists);
    }
}
