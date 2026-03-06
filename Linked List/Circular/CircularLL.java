package CircularLinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;

        if(curr.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = curr.next;
            if(n.val == val) {
                curr.next = n.next;
                break;
            }
            curr = curr.next;
        } while (curr != head);
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while(temp != head);
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
