package LinkedList;

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

public class AddTwoNumberIIQuestion445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currFirst = l1, prevFirst = null, nextFirst = null;
        while (currFirst != null) {
            nextFirst = currFirst.next;
            currFirst.next = prevFirst;
            prevFirst = currFirst;
            currFirst = nextFirst;
        }
        ListNode currSecond = l2, prevSecond = null, nextSecond = null;
        while (currSecond != null) {
            nextSecond = currSecond.next;
            currSecond.next = prevSecond;
            prevSecond = currSecond;
            currSecond = nextSecond;
        }
        ListNode prevL1 = prevFirst;
        ListNode prevL2 = prevSecond;
        ListNode result = null;
        int carry = 0, sum = 0;
        while (prevL1 != null || prevL2 != null || carry > 0) {
            sum = carry;
            if (prevL1 != null) {
                sum += prevL1.val;
                prevL1 = prevL1.next;
            }
            if (prevL2 != null) {
                sum += prevL2.val;
                prevL2 = prevL2.next;
            }
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = result;
            result = newNode;
            carry = sum / 10;
        }
        return result;
    }
}