public class SinglyLL {
    private Node head;
    private Node tail;

    private int size;
    public SinglyLL() {
        this.size = 0;
    }

    public void insertBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertEnd(int value) {
        if(tail == null) {
            insertBeginning(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insertBetween(int value, int index) {
        if(index == 0) {
            insertBeginning(value);
            return;
        }
        if(index == size) {
            insertEnd(value);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public Node get(int index) {
        if(index < 0 || index >= size) {
            return null;
        }

        Node node = head;

        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteBeginning() {
        if(size == 0) {
            System.out.println("Deletion not possible");
            return;
        }

        head = head.next;
        size--;

        if(size == 0) {
            head = tail = null;
        }
    }

    public void deleteEnd() {
        if(size == 0) {
            System.out.println("Deletion not possible");
            return;
        }
        if(size == 1) {
            deleteBeginning();
            return;
        }

        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public void deleteBetween(int index) {
        if(index >= size || index < 0) {
            System.out.println("Deletion not possible");
            return;
        }

        if(index == 0) {
            deleteBeginning();
            return;
        }
        if(index == size-1) {
            deleteEnd();
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(){}
    }
}
