package LinkedList.Delete;


public class DeleteInMiddleQuestion237 {

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;

        while(node != null && node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        if(node != null){
            if(prev != null){
                prev.next = null;
            } else{
                node = null;
            }
        }
    }
}
}
