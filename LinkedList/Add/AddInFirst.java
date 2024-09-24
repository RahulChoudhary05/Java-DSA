package LinkedList.Add;

import java.util.*;

public class AddInFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        AddInFirst ll = new AddInFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printList();
    }

    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);

        // Step 2: Check if the list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            // Add new node at the beginning
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
