package LinkedList.Delete;
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DeleteElementByKValue {
    public static void main(String[] args) {
        System.out.println("DeleteElementByKValue");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 3;
        ListNode result = deleteElementByK(head, k);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode deleteElementByK(ListNode head, int k) {
        if (head == null) { return head; }
        if (k == 1) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        int count = 0;
        ListNode prev = null;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;   
        }
        return head;
    }
}