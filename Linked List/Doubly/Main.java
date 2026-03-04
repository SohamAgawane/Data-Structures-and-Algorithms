package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();

        System.out.println();

        list.inserLastTailPresent(90);
        list.display();

        System.out.println();

        list.insertLastTailNotPresent(80);
        list.display();

        System.out.println();

        list.insertAfterValue(30, 70);
        list.display();
    }
}
