import java.util.*;
public class DeleteMiddleNode {
    public static Node optimal(Node head){
        if(head==null || head.next==null) return null;
        Node fast=head;Node slow=head;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node del=slow.next;
        slow.next=slow.next.next;
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
        int arr[]={1,2,3,4,5};
        Node head=arraytoLL(arr);
        traverse(head);
        traverse(optimal(head));
    }
}
