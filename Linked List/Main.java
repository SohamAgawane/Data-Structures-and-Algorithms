public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insertBeginning(10);
        list.insertBeginning(20);
        list.insertBeginning(30);
        list.insertBeginning(40);
        list.display();

        System.out.println();

        list.insertEnd(100);
        list.display();

        System.out.println();

        list.insertBetween(70, 2);
        list.display();

        System.out.println();

        list.deleteBeginning();
        list.display();

        System.out.println();

        list.deleteEnd();
        list.display();

        System.out.println();

        list.deleteBetween(1);
        list.display();
    }
}
