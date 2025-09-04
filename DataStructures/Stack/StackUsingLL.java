import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
    public Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}
public class StackUsingLL {
    static Scanner sc=new Scanner(System.in);
    static int size=0;
    static Node top=null;
    public static void push(int val){
        if(top==null){
            top=new Node(val);
        }
        else{
            Node temp=new Node(val,top);
            top=temp;
        }
        size++;
    }
    public static void pop(){
        if(top==null){
            System.out.println("Stack underflow.");
        }
        else{
            System.out.println("Popped "+top.val);
            top=top.next;
            size--;
        }
    }
    public static void peek(){
        if(top==null) System.out.println("Stack underflow");
        else{
            System.out.println("Top element: "+top.val);
        }
    }
    public static void printLL(){
    Node temp = top;
    if (temp == null) {
        System.out.println("Stack is empty.");
        return;
    }
    while (temp != null) {   
        System.out.println(temp.val);
        temp = temp.next;
    }
}

    public static void size(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        size();
        printLL();
        pop();
        peek();
        pop();
        size();

    }
}
