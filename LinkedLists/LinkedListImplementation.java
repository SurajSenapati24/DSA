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
        Node temp=head;
    }
    public static Node ArraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void delete(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        Node head=new Node(0);
        insert(head, 1);
        insert(head, 2);
        insert(head, 3);
        traverse(head);
        delete(head);
        traverse(head);
        int []arr={1,2,4,5,6,7};
        Node newhead=ArraytoLL(arr);
        traverse(newhead);
    }
}
