package LinkedList;

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
public class RandomNodeQuestion382 {
    ListNode temp;
    public RandomNodeQuestion382(ListNode head) {
        temp = head;
    }
    
    public int getRandom() {
        int result = 0;
        ListNode tempArray = temp;
        int count = 1;
        while(tempArray != null){
            if(Math.random() < 1.0 / count){
            result = tempArray.val;
            }
            count++;
            tempArray = tempArray.next;
        }
        return result;
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
}
