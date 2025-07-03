import java.util.*;
public class ReverseALinkedList {
    public static Node iterativeOptimal(Node head){
        Node temp=head;
        Node front=null, prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node brute(Node head){
        Node temp=head;
        Stack<Integer> s=new Stack<>();
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=s.pop();
            temp=temp.next;
        }
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
        head=iterativeOptimal(head);
        traverse(head);
    }
}
