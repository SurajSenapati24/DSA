package LinkedLists;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(6);
        list.display();
        System.out.println("Size of the linkedlist is: "+list.size());

    }
}
