package PROBLEM_SOLVING.DSA;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public CustomLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {

    }

    public void prepend(int value) {

    }

    public void insert(int index, int value) {

    }
}
