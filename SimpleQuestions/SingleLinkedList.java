// Apply the concept of Linked list and write code to Insert and Delete an element at the beginning and end of Singly Linked List

import java.util.Scanner;

public class SingleLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        display();
    }

    static void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            display();
        }
    }

    static void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        display();
    }

    static void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            display();
        }
    }

    static void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to add at the beginning");
        System.out.println("Enter 2 to delete from the beginning");
        System.out.println("Enter 3 to add at the end");
        System.out.println("Enter 4 to delete from the end");
        System.out.println("Enter 5 to display the list");

        while (true) {
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter element: ");
                int data = scanner.nextInt();
                addAtStart(data);
            } else if (choice == 2) {
                deleteFromStart();
            } else if (choice == 3) {
                System.out.print("Enter element: ");
                int element = scanner.nextInt();
                addAtEnd(element);
            } else if (choice == 4) {
                deleteFromEnd();
            } else if (choice == 5) {
                display();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
