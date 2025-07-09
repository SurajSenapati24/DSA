import java.util.*;
public class OddEvenLinkedList {
    public static Node solution(Node head){
        if(head==null || head.next==null) return head;
        Node odd=head;
        Node even=head.next;
        Node headeven=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=headeven;
        return head;
    }
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node arraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=arraytoLL(arr);
        traverse(head);
        head=solution(head);
        traverse(head);
    }
}
