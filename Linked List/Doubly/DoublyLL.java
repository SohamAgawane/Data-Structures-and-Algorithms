package DoublyLinkedList;

import SInglyLinkedList.SinglyLL;

public class DoublyLL {
    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = null;
        head = newNode;
    }

    public void inserLastTailPresent(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
    }

    public void insertLastTailNotPresent(int val) {
        Node newNode = new Node(val);

        newNode.next = null;

        if(head == null) {
            head.prev = null;
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next =  newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    public void insertAfterValue(int after, int val) {
        Node prevNode = head;

        while(prevNode != null && prevNode.val != after) {
            prevNode = prevNode.next;
        }

        if(prevNode == null) {
            System.out.println("Node does not exist");
            return;
        }

        Node newNode = new Node(val);

        newNode.next = prevNode.next;
        newNode.prev = prevNode;

        if(prevNode.next != null) {
            prevNode.next.prev = newNode;
        }

        prevNode.next = newNode;

        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;

        System.out.print("null <- ");

        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next =  next;
            this.prev = prev;
        }
    }
}
