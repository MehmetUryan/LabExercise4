/**
 * TokenStack.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;

        // complete the constructor accordinally
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assigned the top pointer to null
        top = null;
    }

    public void push(String value) {
        //       Connect it to the current top.
        //       Update top.
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        String value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}