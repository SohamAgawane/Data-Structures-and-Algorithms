package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
        System.out.println();

        list.delete(30);
        list.display();
    }
}
