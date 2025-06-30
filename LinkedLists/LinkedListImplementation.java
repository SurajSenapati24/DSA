import java.nio.file.NotDirectoryException;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
public class LinkedListImplementation {
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int size(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void insert(Node head,int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val);
    }
    public static void insertAt(Node head, int val, int position){

    }
    public static void main(String[] args) {
        Node head=new Node(0);
        insert(head, 1);
        insert(head, 2);
        traverse(head);
    }
}
