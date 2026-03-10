

class MyLinkedList {
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for(int i=0; i<index-1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0) {
            head = head.next;
            if(size == 1) tail = null;
            size--;
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        if(index == size-1) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */