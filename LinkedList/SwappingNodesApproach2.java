public class SwappingNodesApproach2 {
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

    public ListNode swapNodes(ListNode head, int k) {
        ListNode P1 = null;
        ListNode P2 = null;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (P2 != null) {
                P2 = P2.next;
            }
            if (k == count) {
                P1 = temp;
                P2 = head;
            }
            temp = temp.next;
        }

        int swapTemp = P1.val;
        P1.val = P2.val;
        P2.val = swapTemp;
        return head;
    }
}
