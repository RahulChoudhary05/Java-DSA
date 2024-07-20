//Analyze if a stack isEmpty or isFull and if element is present return the top element in the stack using templates also perform push and pop operation on the stack.
package Stack;

import java.util.EmptyStackException;
import java.util.Scanner;

class ISEmptyAndFull<T> {
    private Object[] elements;
    private int top;

    public ISEmptyAndFull(int capacity) {
        elements = (Object[]) new Object[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }

    public void push(T item) {
        if (!isFull()) {
            elements[++top] = item;
            System.out.println("Pushed element: " + item);
        } else {
            System.out.println("Stack is full. Cannot push element " + item);
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T item = (T) elements[top];
            elements[top--] = null;
            System.out.println("Popped element: " + item);
            return item;
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (!isEmpty()) {
            T item = (T) elements[top];
            return item;
        } else {
            throw new EmptyStackException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of stack: ");
        int capacity = scanner.nextInt();

        ISEmptyAndFull<Integer> stack = new ISEmptyAndFull<>(capacity);

        System.out.println("Enter " + capacity + " elements to push onto the stack: ");
        for (int i = 0; i < capacity; i++) {
            int element = scanner.nextInt();
            stack.push(element);
        }

        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack is full: " + stack.isFull());
        System.out.println("Stack is empty: " + stack.isEmpty());

        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack is full after pop: " + stack.isFull());
        System.out.println("Stack is empty after pop: " + stack.isEmpty());
    }
}