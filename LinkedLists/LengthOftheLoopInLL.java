import java.util.*;
public class LengthOftheLoopInLL {
     public static Node hasCycle(Node head){
        //My solution
        if(head == null || head.next==null) return null;
        Node temp=head;
        Set <Node> st=new HashSet<>();
        while(temp!=null){
            if(!st.contains(temp)){
                st.add(temp);
                temp=temp.next;
            }
            else{
                return temp;
            }
        }
        return null;
    }
    public static Node optimalhasCycle(Node head){
        if(head==null || head.next==null) return null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) {
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static int lengthOfTheLoop(Node head){
        Node temp=optimalhasCycle(head);
        Node t=temp;
        int count=1;
        while(t.next!=temp){
            count++;
            t=t.next;
        }
        return count;
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
        System.out.println(lengthOfTheLoop(nhead));
    }
}
