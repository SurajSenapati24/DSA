import java.util.*;
public class MiddleOftheLinkedList {
    public static Node arraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int sizeOfLL(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static Node middleNode(Node head){
        int size=sizeOfLL(head);
        if(size==1) return head;
        int n=size/2;
        int count=0;
        Node temp=head;
        while (count<n) {
            temp=temp.next;
            count++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=arraytoLL(arr);
        System.out.println(sizeOfLL(head));
        printLL(head);
        Node temp=head;
        head=middleNode(temp);
        printLL(head);
    }
}
