import java.util.*;
class Node {
    int data;
    Node next,prev;
    public Node(int data) {
        this.data = data;
        prev=null;
        next=null;
    }
    public Node(int data, Node prev, Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}
public class DoublyLinkedListImplementation {
    public static Node insertHead(Node head, int val) {
        Node temp = head;
        head = new Node(val, null, temp);
        if (temp != null) {
            temp.prev = head;
        }
        return head;
    }

    public static Node arrayToDll(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node n=new Node(arr[i], temp, null);
            temp.next=n;
            temp = n;
        }
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=arrayToDll(arr);
        print(head);
    }
}
