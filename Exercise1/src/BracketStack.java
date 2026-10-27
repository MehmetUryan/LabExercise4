/**
 * BracketStack.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);

        // connect newNode to the current top
        // update top
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the top element
    public char pop() {
        // After saving top.data, the new top should be the node that comes after the current top.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        char value = top.data;
        top = top.next;
        return value;
    }

    // Return the top element without removing it
    public char peek() {
        // Control if the stack is empty; if it is, then return null
        // if not return the data of the top
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return top.data;
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}