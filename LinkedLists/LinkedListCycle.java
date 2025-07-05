import java.util.*;
public class LinkedListCycle{// 141
    public static boolean hasCycle(Node head){
        //My solution
        if(head == null || head.next==null) return false;
        Node temp=head;
        Set <Node> st=new HashSet<>();
        while(temp!=null){
            if(!st.contains(temp)){
                st.add(temp);
                temp=temp.next;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static boolean optimalhasCycle(Node head){
        if(head==null || head.next==null) return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
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
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7};
        Node head=ArraytoLL(arr);
        System.out.println(hasCycle(head));
        Node nhead=new Node(0);
        Node c=new Node(1);
        nhead.next=c;
        c.next=new Node(2);
        c.next.next=new Node(3);
        c.next.next.next=c;
        System.out.println(optimalhasCycle(nhead));  
    }
}