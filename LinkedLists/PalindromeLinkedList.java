import java.util.*;
public class PalindromeLinkedList{
    public static boolean isPalindromebrute(Node head){
        if(head==null) return false;
        if(head.next==null) return true;
        Node temp=head;
        Stack<Integer> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(stack.peek()==temp.data){
                stack.pop();
            }
            temp=temp.next;
        }
        if(stack.isEmpty()) return true;
        return false;
        //T.C=O(2N) S.C=O(N)
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
        int arr[]={1,2,2,1};
        Node head=arraytoLL(arr);
        System.out.println(isPalindromebrute(head));
    }
}