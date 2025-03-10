public class SwappingNodesApproach1 {

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

    int linkedListLength(ListNode head) {
        int lenght = 0;
        while (head != null) {
            head = head.next;
            lenght++;
        }
        return lenght;
    }

    public ListNode swapNodes(ListNode head, int k) {
        int length = linkedListLength(head);

        int biggingK = k;
        ListNode Node1 = head;
        while (biggingK > 1) {
            Node1 = Node1.next;
            biggingK--;
        }

        int endingK = length - k + 1;
        ListNode Node2 = head;
        while (endingK > 1) {
            Node2 = Node2.next;
            endingK--;
        }

        int temp = Node1.val;
        Node1.val = Node2.val;
        Node2.val = temp;
        return head;
    }
}
