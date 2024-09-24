package LinkedList.Add;

import java.util.*;

public class AddInLast {
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
        AddInLast ll = new AddInLast();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printList();
        ll.addLast(4);
        ll.addLast(5);
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

    public void addLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);

        // Step 2: Check if the list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            // Add new node at the Last
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) { //current node is not null
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
